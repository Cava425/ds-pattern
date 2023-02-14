package com.ds.pattern.struct.statik.pattern;

import com.ds.pattern.struct.statik.pattern.Person;

public class JackMaid implements Person {
    private Person jack;

    public JackMaid(Person jack) {
        this.jack = jack;
    }

    @Override
    public void eat() {
        System.out.println("jack maid prepare");
        jack.eat();
        System.out.println("jack maid eat");
    }
}
