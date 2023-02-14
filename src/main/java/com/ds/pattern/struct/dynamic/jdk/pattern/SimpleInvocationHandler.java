package com.ds.pattern.struct.dynamic.jdk.pattern;

import com.ds.pattern.struct.dynamic.jdk.pattern.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SimpleInvocationHandler implements InvocationHandler {

    private Person realObj;

    public SimpleInvocationHandler(Person realObj) {
        this.realObj = realObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object invoke = method.invoke(realObj, args);
        System.out.println("after");
        return invoke;
    }
}
