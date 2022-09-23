package Assignments.Inheritance_Odev;

import java.util.Random;

public class Person {

    String name;
    String surName;
    int id;
    double salary;



    public void createId(){
        Random random=new Random();
        this.id=random.nextInt(100)+1;
    }


}
