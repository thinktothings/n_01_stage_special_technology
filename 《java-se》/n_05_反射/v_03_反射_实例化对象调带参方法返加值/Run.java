package com.opensourcesteam.java.enhance.n_05_反射.v_03_反射_实例化对象调带参方法返加值;

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
        String className = "com.opensourcesteam.java.enhance.n_05_反射.v_03_反射_实例化对象调带参方法返加值.Dog";

        Class[] parameterTypes = {String.class};
        Object[] objects = {"你好呀..."};
        Class clazz = Class.forName(className);
        Object object = clazz.newInstance();
        String methodName = "hello";
        Method method = clazz.getMethod(methodName, parameterTypes);
        Object obj = method.invoke(object,objects);
        System.out.println(obj);

    }
}
