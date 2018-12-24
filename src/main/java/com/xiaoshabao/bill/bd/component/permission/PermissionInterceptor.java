package com.xiaoshabao.bill.bd.component.permission;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Properties;

import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 权限拦截器
 */
/*
 * @intercepts声明该类为拦截器，@signature声明拦截对象。
 * Mybatis获取Statement是在statementHandler中,因为我们需要拦截的对象应该是Statement，在StatementHandler类中有返回值为Statement的Prepare方法，所以，这个类就是我们需要拦截的对象。
 * method为我们需要拦截的prepare方法，type为所要拦截的接口类，args为prepare方法的参数。
 */
@Component
@Intercepts({ @Signature(method = "prepare", type = StatementHandler.class, args = { Connection.class,Integer.class}) })
public class PermissionInterceptor implements Interceptor{
	/** 日志 */
    private static final Logger log = LoggerFactory.getLogger(PermissionInterceptor.class);

	/**
	 * 拦截到对象后所进行操作的位置，也就是我们之后编写逻辑代码的位置。
	 * <p>
	 * Invocation的三个参数：<br>
	 *    private Object target;	//所拦截到的目标的代理<br>
 	 *	  private Method method;	//所拦截目标的具体方法<br>
 	 *	  private Object[] args;	//方法的参数<br>
	 * </p>
	 */
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		log.debug("进入 PermissionInterceptor  拦截器...");
        if(invocation.getTarget() instanceof RoutingStatementHandler) {
            RoutingStatementHandler handler = (RoutingStatementHandler) invocation.getTarget();
            //由于mappedStatement中有我们需要的方法id,但却是protected的，所以要通过反射获取
    		MetaObject statementHandler = SystemMetaObject.forObject(handler);
    		MappedStatement mappedStatement = (MappedStatement) statementHandler.getValue("delegate.mappedStatement");
    		String id = mappedStatement.getId();
    		Permission permission=null;
    		try {
                String className = id.substring(0, id.lastIndexOf("."));
                String methodName = id.substring(id.lastIndexOf(".") + 1, id.length());
                final Class<?> cls = Class.forName(className);
                final Method[] method = cls.getMethods();
                for (Method me : method) {
                    if (me.getName().equals(methodName)) {
                    	 if(me.isAnnotationPresent(Permission.class)) {
                    		 permission = me.getAnnotation(Permission.class);
                    	 }
                    	 break;
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
    		if(permission==null) {
    			log.debug("数据权限放行...");
    			return invocation.proceed();
    		}
    		//获取sql
    		BoundSql boundSql = handler.getBoundSql();
    		String sql = boundSql.getSql();
    		//获得方法类型
    		SqlCommandType sqlCommandType = mappedStatement.getSqlCommandType();
			// 增强sql代码块
    		switch (sqlCommandType) {
			case SELECT:
				StringBuilder sbSql = new StringBuilder(sql);
				
				String departLike="%";//此处实际在session中获取
				sbSql = new StringBuilder("select * from (").append(sbSql).append(" ) s where s.regionCd like concat("+ departLike +",'%')  ");
				// 将增强后的sql放回
				statementHandler.setValue("delegate.boundSql.sql", sbSql.toString());
				break;
			default:
				log.debug("数据权限放行(不是select类型)...");
				break;
			}
        }
        return invocation.proceed();
    }

	/**
	 * 拦截我们需要拦截到的对象
	 */
	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	/**
	 * 以通过配置文件中进行properties配置,然后在该方法中读取到配置
	 */
	@Override
	public void setProperties(Properties properties) {
		
	}

}
