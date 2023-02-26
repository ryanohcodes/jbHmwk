package org.session3;

public class Animal {
    private double age;
    private final String name;
    private double weight;
    private final String type;

    public Animal(double age, String name, double weight, String type){
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.type = type;
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public void feed() {
        System.out.println(this.name + " feeding");
    }
}
