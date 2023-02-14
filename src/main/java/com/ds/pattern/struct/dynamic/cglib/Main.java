package com.ds.pattern.struct.dynamic.cglib;

import com.ds.pattern.struct.dynamic.cglib.pattern.Jack;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Jack.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("before");
                Object ret = methodProxy.invokeSuper(o, objects);
                System.out.println("after");
                return ret;
            }
        });

        Jack jack = (Jack) enhancer.create();
        jack.eat("炸鸡");
    }
}
