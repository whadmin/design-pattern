package com.geekerstar.design.pattern.creational.singleton;

/**
 * @author geekerstar
 * date: 2019/1/11 09:43
 * description:
 */
public class T implements Runnable {

    public void run() {
//        LazyMethodSingleton lazySingleton = LazyMethodSingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
//        LazyStaticInnerClassSingleton instance = LazyStaticInnerClassSingleton.getInstance();
        ContainerSingleton.putInstance("object",new Object());
        Object instance = ContainerSingleton.getInstance("object");
        System.out.println(Thread.currentThread().getName()+" "+instance);

    }
}
