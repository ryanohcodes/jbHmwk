package org.session3;

public class Tiger extends Animal{
    public Tiger(double age, String name, double weight, String type) {
        super(age, name, weight,type);
    }
    @Override
    public void feed(){
        System.out.println(this.getName() + " is feeding on other tigers.");
    }
}
