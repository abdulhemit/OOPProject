package com.example.oopproject;

public class Musician {
    private String name;
    private String job;
    private int age;

    public Musician(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(int age,String password){
        if (password == "ibo"){
            this.age = age;
        }
    }
}
