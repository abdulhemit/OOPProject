package com.example.oopproject;

public class SuperMusician extends Musician {
    public SuperMusician(String name, String job, int age) {
        super(name, job, age);
    }

    public String sing(){
        return "Nothing Else Matters";
    }
}
