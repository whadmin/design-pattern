package com.geekerstar.design.pattern.creational.singleton;

/**
 * 双重检查懒汉式单例模式
 * 1 getInstance方法内使用类锁(synchronized)，保证创建单例对象线程安全【只会创建一个lazyDoubleCheckSingleton保证线程安全】
 * 2 创建单例对象的引用使用volatile关键字保证对多线程的可见性
 * 3 创建一个单例先检查当前对象是否已经创建，没有创建获取锁创建，在创建的时候再次检查对象是否已经创建。
 * 再次检查的原因是因为创建对象分为3个步骤，前面一个线程可能还没执行完步骤3就释放了锁
 * //1.分配内存给这个对象
 * //2.初始化对象
 * //3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton(){

    }
    public static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazyDoubleCheckSingleton == null){
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }

        }
        return lazyDoubleCheckSingleton;
    }
}
