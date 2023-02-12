package com.ds.pattern.create.factory.method;

import com.ds.pattern.create.factory.simple.Product;

public class Client {
    public static void main(String[] args) {
        Factory factory = new PaFactoryImpl();
        Product pa = factory.getProduct();
        pa.doSomething();
    }

    /**
     * 工厂方法
     * 简单工厂模式适用于创建行为简单，产品稀少的情形；随着产品增多，创建逻辑复杂，工厂的职责会变得越来越多，难以维护。
     * 根据单一职责原则，将工厂进行拆分，对工厂本身进行抽象。
     *
     * 应用：
     *  org.slf4j.ILoggerFactory
     *
     * 优点：
     *  灵活性增强，对于新的产品，只需多些一个相应的工厂
     *  典型的解耦框架，高层模块只需要知道产品的抽象类，无序关心其他实现类，满足迪米特法则、依赖倒置原则、里氏替换原则
     * 缺点：
     *  类的个数容易过多，增加复杂度
     *  增加了系统的抽象性和理解难度
     *  抽象产品只能创建一种，此弊端可用抽象工厂模式解决
     */
}
