package com.ds.pattern.create.factory.method;

import com.ds.pattern.create.factory.simple.Product;
import com.ds.pattern.create.factory.simple.impl.ProductA;

public class PaFactoryImpl implements Factory{
    @Override
    public Product getProduct() {
        return new ProductA();
    }
}
