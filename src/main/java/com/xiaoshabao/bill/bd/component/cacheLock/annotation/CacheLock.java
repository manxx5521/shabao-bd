package com.xiaoshabao.bill.bd.component.cacheLock.annotation;

import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;

/**
 * 缓存锁注解
 * <p>
 * 在request对象中获取一个名字是 token() 的对象，根据此对象判断重复。
 * 
 * </p>
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface CacheLock {
	/**
     * redis 锁key的前缀
     * @return redis 锁key的前缀
     */
	String value() default "cacheLock";
	
	/**
     * token传递的字段名
     */
	String token() default "token";

    /**
     * 过期秒数,默认为5秒
     * @return 轮询锁的时间
     */
    int expire() default 5;

    /**
     * 超时时间单位
     * @return 秒
     */
    TimeUnit timeUnit() default TimeUnit.SECONDS;

    /**
     * <p>Key的分隔符（默认 :）</p>
     * <p>生成的Key：N:SO1008:500</p>
     * @return String
     */
    String delimiter() default ":";

}