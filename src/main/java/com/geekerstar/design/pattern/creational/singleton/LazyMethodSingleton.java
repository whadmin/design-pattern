package com.geekerstar.design.pattern.creational.singleton;

/**
 * 方法锁懒汉模式
 * 缺点：并发率太低，不建议使用
 */
public class LazyMethodSingleton {
    private static LazyMethodSingleton lazyMethodSingleton = null;

    private LazyMethodSingleton() {
        if (lazyMethodSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public synchronized static LazyMethodSingleton getInstance() {
        if (lazyMethodSingleton == null) {
            lazyMethodSingleton = new LazyMethodSingleton();
        }
        return lazyMethodSingleton;
    }


//    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Class objectClass = LazyMethodSingleton.class;
//        Constructor c = objectClass.getDeclaredConstructor();
//        c.setAccessible(true);
//
//        LazyMethodSingleton o1 = LazyMethodSingleton.getInstance();
//
//        Field flag = o1 .getClass().getDeclaredField("flag");
//        flag.setAccessible(true);
//        flag.set(o1,true);
//
//        LazyMethodSingleton o2 = (LazyMethodSingleton)c.newInstance();
//
//        System.out.println(o1);
//        System.out.println(o2);
//        System.out.println(o1 == o2);
//    }
}
