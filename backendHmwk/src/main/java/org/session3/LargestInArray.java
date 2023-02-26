package org.session3;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Float.NEGATIVE_INFINITY;

public class LargestInArray {
    public static double largestNumber(){
        System.out.println("Enter zero to quit");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        String answer = scanner.nextLine();
        while(!answer.equals("0")){
            numbers.add(Double.parseDouble(answer));
            answer = scanner.nextLine();
        }
        double largest = NEGATIVE_INFINITY ;
        for(Double current : numbers){
            if(current > largest) largest = current;
        }
        return largest;
    }
}
