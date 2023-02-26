package org.session3;

public class Turtle extends Animal {
    public Turtle(double age, String name, double weight, String type) {
        super(age, name, weight, type);
    }
    @Override
    public void feed(){
        System.out.println(this.getName() + " is feeding on grass.");
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
