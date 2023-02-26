package org.session3;

public class Rectangle {
    private final double length;
    private final double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        return this.length * this.width;
    }

}
