package com.xiaoshabao.bill.bd.component.cacheLock.interceptor;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.xiaoshabao.base.component.ContextHolderUtils;
import com.xiaoshabao.base.exception.ServiceException;
import com.xiaoshabao.bill.bd.component.cacheLock.annotation.CacheLock;

/**
 * 上一章说过通过接口注入的方式去写不同的生成规则;
 */
@Component
public class LockKeyGenerator implements CacheKeyGenerator {

	@Override
	public String getLockKey(ProceedingJoinPoint pjp) {
		MethodSignature signature = (MethodSignature) pjp.getSignature();
		Method method = signature.getMethod();
		CacheLock lockAnnotation = method.getAnnotation(CacheLock.class);
		HttpServletRequest request = null;
		final Object[] args = pjp.getArgs();
		for (int i = 0; i < args.length; i++) {
			Object obj = args[i];
			if (obj instanceof HttpServletRequest) {
				request = (HttpServletRequest) obj;
				break;
			}
		}
		if (request == null) {
			request = ContextHolderUtils.getRequest();
		}
		String token = request.getParameter(lockAnnotation.token());
		if (StringUtils.isEmpty(token)) {
			throw new ServiceException("没有在参数中解析出表单token，无法进行表单锁定！");
		}
		StringBuilder builder = new StringBuilder();
		builder.append(lockAnnotation.value()).append(lockAnnotation.delimiter()).append(token);
		return builder.toString();
	}

}
