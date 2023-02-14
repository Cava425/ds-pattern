package com.ds.pattern.create.builder;

import com.ds.pattern.create.builder.pattern.Product;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;

public class Main {
    public static void main(String[] args) {
        /**
         * builder pattern 建造者模式
         * 场景：
         *  - {@link StringBuilder}
         *  - {@link SqlSessionFactory}
         *  - {@link BeanDefinitionBuilder}
         *
         * 建造者模式 VS 工厂模式
         *  - 建造者模式注重方法的调用顺序，工厂模式注重创建对象
         *  - 创建对象的力度不同，创建者模式创建复杂对象，工厂模式创建的对象都一样
         *
         */

        Product.BuilderImpl builder = new Product.BuilderImpl();
        Product product = builder.setFirstName("1")
                .setLastName("2")
                .builder();
        System.out.println(product);
    }
}
