package com.ds.pattern.struct.statik;

import com.ds.pattern.struct.statik.pattern.Jack;
import com.ds.pattern.struct.statik.pattern.JackMaid;
import com.ds.pattern.struct.statik.pattern.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new JackMaid(new Jack());
        p.eat();
    }
}
