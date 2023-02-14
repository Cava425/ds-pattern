package com.ds.pattern.struct.dynamic.jdk;

import com.ds.pattern.struct.dynamic.jdk.pattern.Jack;
import com.ds.pattern.struct.dynamic.jdk.pattern.Person;
import com.ds.pattern.struct.dynamic.jdk.pattern.SimpleInvocationHandler;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Person proxy = (Person) Proxy.newProxyInstance(
                Person.class.getClassLoader(),
                new Class[]{Person.class},
                new SimpleInvocationHandler(new Jack())
        );
        proxy.eat("炸鸡");
    }
}
