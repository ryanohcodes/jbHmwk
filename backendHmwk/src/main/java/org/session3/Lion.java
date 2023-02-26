package org.session3;

public class Lion extends Animal{
    private String color;
    public Lion(double age, String name, double weight, String type, String color) {
        super(age, name, weight,type);
        this.color = color;
    }
    @Override
    public void feed(){
        System.out.println(this.getName() + " is feeding on Lion prey. And is the color " +this.color);
    }
}
