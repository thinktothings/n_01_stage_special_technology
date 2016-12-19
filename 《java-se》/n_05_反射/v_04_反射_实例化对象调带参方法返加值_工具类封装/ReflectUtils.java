package com.opensourcesteam.java.enhance.n_05_反射.v_04_反射_实例化对象调带参方法返加值_工具类封装;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 开发人：刘文
 * 日期：2016/10/20.
 * 版权所有：小牛学堂 (http://edu360.cn)
 * 描述：
 */
public class ReflectUtils {

    public static Object  callMethod(String classTotalName,String methodName,String[] methodParameterTypes,Object[] methodParameterValues) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException {
        Class[] parameterTypes = new Class[methodParameterTypes.length];
        for(int i =0;i< methodParameterTypes.length;i++){
            parameterTypes[i] = Class.forName(methodParameterTypes[i]);
        }

        Class clazz = Class.forName(classTotalName);
        Object object = clazz.newInstance();

        Method method = clazz.getMethod(methodName, parameterTypes);
        Object obj = method.invoke(object,methodParameterValues);
        return obj;
    }
}
