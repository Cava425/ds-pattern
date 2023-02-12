package com.ds.pattern.create.factory.simple;

import com.ds.pattern.create.factory.simple.impl.ProductA;
import com.ds.pattern.create.factory.simple.impl.ProductB;

public class Client {
    public static void main(String[] args) {
        Product pa = SimpleFactory.getProduct(SimpleFactory.Type.PA.getCode());
        Product pb = SimpleFactory.getProduct(SimpleFactory.Type.PB.getCode());
        pa.doSomething();
        pb.doSomething();

        Product paV1 = SimpleFactoryV1.getProduct("com.ds.pattern.create.factory.simple.impl.ProductA");
        Product pbV1 = SimpleFactoryV1.getProduct("com.ds.pattern.create.factory.simple.impl.ProductB");
        paV1.doSomething();
        pbV1.doSomething();

        Product paV2 = SimpleFactoryV2.getProduct(ProductA.class);
        Product pbV2 = SimpleFactoryV2.getProduct(ProductB.class);
        paV2.doSomething();
        pbV2.doSomething();
    }

    /**
     * 简单工厂模式
     * 优点：
     *  结构简单，调用方便；工厂和产品职责明确
     * 缺点：
     *  工厂类单一，负责所有展品的创建，产品基数增多时，代码臃肿，违背高内聚、低耦合的原则
     */
}
