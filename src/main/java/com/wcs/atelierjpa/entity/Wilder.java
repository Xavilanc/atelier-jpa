package com.wcs.atelierjpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wilder {
    
    //Primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Attributes
    private String name;
    private int age;

    //A mettre même vide
    public Wilder() {
    }

    public Wilder(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter and setter for the name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getter and setter for the age
    public Integer getAge() {
        return age;
    }

    public int setAge(int age) {
        return this.age = age;
    }


}
