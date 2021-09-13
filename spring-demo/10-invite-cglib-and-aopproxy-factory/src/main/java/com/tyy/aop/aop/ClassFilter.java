package com.tyy.aop.aop;

/**
 * @author yihua.huang@dianping.com
 */
public interface ClassFilter {

    boolean matches(Class targetClass);
}
