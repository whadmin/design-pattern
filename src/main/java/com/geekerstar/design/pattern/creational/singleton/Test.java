package com.geekerstar.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author geekerstar
 * date: 2019/1/11 09:41
 * description:
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazyMethodSingleton lazySingleton = LazyMethodSingleton.getInstance();

//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("program end");


//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//        System.out.println(instance);
//        System.out.println(newInstance);
//
//        System.out.println(instance == newInstance);

//        Class objectClass = HungrySingleton.class;
//        Class objectClass = LazyStaticInnerClassSingleton.class;

        Class objectClass = LazyMethodSingleton.class;

        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        LazyMethodSingleton instance = LazyMethodSingleton.getInstance();
        LazyMethodSingleton newInstance = (LazyMethodSingleton) constructor.newInstance();

//        HungrySingleton instance = HungrySingleton.getInstance();
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

//        LazyStaticInnerClassSingleton instance = LazyStaticInnerClassSingleton.getInstance();
//        LazyStaticInnerClassSingleton newInstance = (LazyStaticInnerClassSingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);




    }
}
