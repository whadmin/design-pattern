package com.geekerstar.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 饿汉式单例模式，类HungrySingleton加载的时候初始化。
 * 优点： 不会因为多线程环境下，生成多个HungrySingleton对象,没有锁的限制[类加载的初始化是线程同步的]，返回hs速度较快
 * 缺点： 无论程序需不需要HungrySingleton对象，程序只要加载了HungrySingleton，就有一个HungrySingleton对象
 *
 */
public class HungrySingleton implements Serializable {

    private final static HungrySingleton hungrySingleton;
    static {
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton(){
        if (hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
    private Object readResolve(){
        return hungrySingleton;
    }
}
