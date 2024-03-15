package com.toUse;

import com.base.Animal;

public class Dog extends Animal {

    @Override
    public void scream() {
        super.scream();
        System.out.println("I'm a dog!");
    }
}
