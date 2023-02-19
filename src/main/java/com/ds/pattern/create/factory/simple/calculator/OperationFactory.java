package com.ds.pattern.create.factory.simple.calculator;

public class OperationFactory {

    public static Operator create(String operator){
        Operator oper = null;
        switch (operator){
            case "+":
                oper = new Add();
                break;
        }
        return oper;
    }

}
