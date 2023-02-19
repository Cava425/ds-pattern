package com.ds.pattern.create.factory.simple.calculator;

public interface Operator<T> {
    T execute(T o1, T o2);
}
