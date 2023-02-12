package com.ds.pattern.create.factory.simple.impl;

import com.ds.pattern.create.factory.simple.Product;

public class ProductA implements Product {
    @Override
    public void doSomething() {
        System.out.println("ProductA doSomething");
    }
}
