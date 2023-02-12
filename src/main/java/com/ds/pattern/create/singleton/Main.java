package com.ds.pattern.create.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        /**
         * 单例模式
         * 保证一个类在任何情况下只有一个实例，并提供一个全局的访问方法。
         *
         * 应用：
         * 公司的CEO、部门经理都属于单例模型。
         * J2EE标准中的ServletContext、Spring框架中的ApplicationContext、数据库中的连接池也都是单例模式。
         * - 需要频繁创建的一些类，使用单例可以降低系统的内存压力，减少GC
         * - 某些类创建实例时占用资源较多，或实例化时间较长，且经常使用
         * - 频繁访问数据库或文件对象
         */

        SpringApplication.run(Main.class);

        Singleton instance = Singleton.getInstance();
        System.out.println();
    }
}
