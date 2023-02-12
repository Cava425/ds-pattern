package com.ds.pattern.create.factory.simple;

public class SimpleFactoryV2 {
    public static Product getProduct(Class<? extends Product> clazz) {
        if(clazz != null){
            try {
                return clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        throw new RuntimeException("not fount class");
    }
}
