package com.ds.pattern.create.factory.simple.impl;

import com.ds.pattern.create.factory.simple.Product;

public class ProductB implements Product {
    @Override
    public void doSomething() {
        System.out.println("ProductB doSomething");
    }
}
