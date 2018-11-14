package com.ad.custom;

import java.lang.reflect.Method;

/**
 * @author ZhengYingDeng
 * @email 892467242@qq.com
 * @create 16:09 2018/11/14
 **/
public interface ADInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
