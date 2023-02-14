package com.ds.pattern.create.prototype;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        /**
         * JDK中抽象原型接口 {@link Cloneable}
         * 之所以提供该接口，为了在运行时通知Java虚拟机，可以安全的在该类上调用clone方法；
         * 如果没有实现cloneable接口，则调用clone方法会抛出CloneNotSupportedException
         *  - 这种clone对象的方式是浅克隆，如果需要深克隆，使用序列化的方式
         *  - JDK中ArrayList的克隆方法
         *  - Spring中使用注解@Scope("prototype")设置原型模式
         *
         * 优点：
         *  Java自带的原型模式基于二进制流赋值，在性能上比直接new一个对象要好
         *  可以使用深克隆的方式保存对象的状态，在需要时恢复历史某一状态，达到撤销操作的效果
         */
        Dog d1 = new Dog();
        d1.name = new ArrayList<>(Arrays.asList("1"));
        Dog d2 = (Dog) d1.clone();
        d2.name.add("2");
        System.out.println(d1.name);

        Cat c1 = new Cat();
        c1.name = new ArrayList<>(Arrays.asList("1"));
        Cat c2 = (Cat) c1.clone();
        c2.name.add("2");
        System.out.println(c1.name);
    }


    public static class Dog implements Cloneable{

        public List<String> name;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
    public static class Cat implements Cloneable, Serializable {

        public List<String> name;

        @Override
        protected Object clone() {
            try{
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(this);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                return objectInputStream.readObject();
            }catch (Exception e){
                e.printStackTrace();
            }
            return null;
        }
    }

}
