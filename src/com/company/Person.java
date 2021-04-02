package com.company;

public class Person {

    // PRIVATE PROPERTIES ++++++++++++++++++++++++++++++
    private String name;
    private int age;
    private double height;
    private double weight;

    // CONSTRUCTORS ++++++++++++++++++++++++++++++++++++
    public Person () {

    }

    public Person (String name, int age, double height, double weight) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // GETTERS +++++++++++++++++++++++++++++++++++++++++


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // PUBLIC METHODS++++++++++++++++++++++++
}
