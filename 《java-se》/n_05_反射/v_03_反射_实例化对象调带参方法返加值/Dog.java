package com.opensourcesteam.java.enhance.n_05_反射.v_03_反射_实例化对象调带参方法返加值;

/**
 * 开发人：刘文
 * 日期：2016/10/20.
 * 版权所有：小牛学堂 (http://edu360.cn)
 * 描述：
 */
public class Dog {
    private String name;
    private int age;
    public Dog() {
    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String hello(){
        return "小狗说，你好";
    }
    public String hello(String message){
        return "小狗说......" + message;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
