package com.example.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*User myUser = new User();
        myUser.name = "Ibrahim";
        myUser.job = "devoloper";
         */
        User myUser = new User("Ibrahim","devoloper");

        //Encapsulation
        Musician james = new Musician("james","Guitay",30);
        System.out.println(james.getJob());
        james.setAge(25,"ibo");


        //Inheritance
        SuperMusician lars = new SuperMusician("Lars","Drums",40);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        //polymorphism

        // static polymorphism
        Mathematics mathematics = new Mathematics();
        mathematics.sum();
        mathematics.sum(5,1);
        mathematics.sum(3,9,1);

        //Dynamic polymorphism
        Animal myAnimal = new Animal();
        myAnimal.sing();

        Dog barley = new Dog();
        barley.test();
        barley.sing();
    }
}