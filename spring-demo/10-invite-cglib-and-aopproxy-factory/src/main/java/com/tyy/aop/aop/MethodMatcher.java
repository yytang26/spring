package com.tyy.aop.aop;

import java.lang.reflect.Method;

/**
 * @author yihua.huang@dianping.com
 */
public interface MethodMatcher {

    boolean matches(Method method, Class targetClass);
}
