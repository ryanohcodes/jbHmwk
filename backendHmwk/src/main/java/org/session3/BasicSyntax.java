package org.session3;

public class BasicSyntax {

    private final double a;
    private final double b;
    public BasicSyntax(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double add(double a, double b){
        return a + b;
    }
    public double subtract(double a, double b){
        return a - b;
    }
    public double multiply(double a, double b){
        return a * b;
    }
    public double divide(double a, double b){
        if( b == 0) return 0.0;
        return a / b;
    }
    public double mod(double a, double b){
        return a % b;
    }
    public void incrementDecrement(double a, double b){
        a = Integer.parseInt(String.valueOf(a));
        b = Integer.parseInt(String.valueOf(b));
        a++;
        b--;
        System.out.println("If we increase a with ++ we get" + a);
        System.out.println("If we decrease b with -- we get" + b);
    }
    public String toString(){
        return "The sum is " + add(a,b) + ".\n" +
                "The difference is " + subtract(a,b) + ".\n" +
                "The product is " + multiply(a,b) + ".\n" +
                "The quotient is " + divide(a,b) + ".\n";
    }

}
