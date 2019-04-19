package com.geekerstar.design.pattern.creational.singleton;

/**
 * 静态内部类懒汉式单例模式
 *
 *
 */
public class LazyStaticInnerClassSingleton {
    private static class InnerClass{
        private static LazyStaticInnerClassSingleton lazyStaticInnerClassSingleton = new LazyStaticInnerClassSingleton();
    }
    public static LazyStaticInnerClassSingleton getInstance(){
        return InnerClass.lazyStaticInnerClassSingleton;
    }
    private LazyStaticInnerClassSingleton(){
        if (InnerClass.lazyStaticInnerClassSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
}
