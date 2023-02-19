package com.ds.pattern.create.factory.simple.calculator;

public class Add implements Operator<Number>{
    @Override
    public Number execute(Number o1, Number o2) {
        return o1.intValue() + o2.intValue();
    }
}
