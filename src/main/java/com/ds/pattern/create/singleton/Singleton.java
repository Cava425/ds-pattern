package com.ds.pattern.create.singleton;

import org.springframework.context.ApplicationContext;

public class Singleton {

    public static final Singleton inst = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        ApplicationContext applicationContext = SpringApplicationContextHolder.getApplicationContext();
        return inst;
    }

}
