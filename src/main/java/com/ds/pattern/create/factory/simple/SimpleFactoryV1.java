package com.ds.pattern.create.factory.simple;

public class SimpleFactoryV1 {
    public static Product getProduct(String className) {
        if(className != null && !"".equals(className)){
            try {
                return (Product) Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        throw new RuntimeException("not fount class");
    }
}
