package com.ds.pattern.create.factory.simple;

import com.ds.pattern.create.factory.simple.impl.ProductA;
import com.ds.pattern.create.factory.simple.impl.ProductB;

public class SimpleFactory {
    /**
     * 如果再增加其他类型的产品,需要修改下面的代码,这不符合开闭原则
     */
    public static Product getProduct(int type){
        if(Type.PA.getCode() == type){
            return new ProductA();
        }else if(Type.PB.code == type){
            return new ProductB();
        }
        throw new RuntimeException("not fount type");
    }


    public enum Type{
        PA(1, "product a"),
        PB(5, "product b"),
        ;

        private int code;
        private String desc;

        Type(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }

}
