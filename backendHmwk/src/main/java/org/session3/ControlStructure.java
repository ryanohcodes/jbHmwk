package org.session3;

import java.util.Scanner;

public class ControlStructure {
    public static String finder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        String answer = scanner.nextLine();
        if(answer.isEmpty()) return "Please enter a number";
        double num = Double.parseDouble(answer);
        if(num == 0) return "Your number is zero";
        else if(num > 0) return "Your number is positive";
        else{
            return "Your number is negative";
        }
    }
}
