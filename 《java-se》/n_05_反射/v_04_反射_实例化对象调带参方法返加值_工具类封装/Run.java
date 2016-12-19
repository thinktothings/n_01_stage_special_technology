package com.opensourcesteam.java.enhance.n_05_反射.v_04_反射_实例化对象调带参方法返加值_工具类封装;

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
        String className = "com.opensourcesteam.java.enhance.n_05_反射.v_04_反射_实例化对象调带参方法返加值_工具类封装.Dog";

        String[] parameterTypes = {"java.lang.String"};
        Object[] objects = {"你好呀..."};
        String methodName = "hello";
        Object obj = ReflectUtils.callMethod(className,methodName,parameterTypes,objects);
        System.out.println(obj);

    }
}
