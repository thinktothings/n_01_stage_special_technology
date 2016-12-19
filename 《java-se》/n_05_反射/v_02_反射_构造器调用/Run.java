package com.opensourcesteam.java.enhance.n_05_反射.v_02_反射_构造器调用;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 开发人：刘文
 * 日期：2016/10/20.
 * 版权所有：小牛学堂 (http://edu360.cn)
 * 描述：
 */
public class Run {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        String className = "com.opensourcesteam.java.enhance.n_05_反射.v_02_反射_构造器调用.Dog";

        Class clazz = Class.forName(className);
        Constructor constructor = clazz.getConstructor();
        Object object = constructor.newInstance();
        String methodName = "hello";
        Method method = clazz.getMethod(methodName);
        Object obj = method.invoke(object);
        System.out.println(obj);

    }
}
