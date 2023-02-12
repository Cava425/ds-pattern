package com.ds.pattern.create.factory.method;

import com.ds.pattern.create.factory.simple.Product;
import com.ds.pattern.create.factory.simple.impl.ProductB;

public class PbFactoryImpl implements Factory{
    @Override
    public Product getProduct() {
        return new ProductB();
    }
}
