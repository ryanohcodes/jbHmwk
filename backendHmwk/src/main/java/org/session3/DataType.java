package org.session3;

import java.util.Scanner;

public class DataType {
    private final Scanner scanner;

    public DataType(Scanner scanner){
        this.scanner = scanner;
    }
    public String start(){
        System.out.println("Please enter your name");
        String name = this.scanner.nextLine();
        System.out.println("Please enter your age");
        String age = this.scanner.nextLine();
        System.out.println("Please enter your salary");
        String salary = this.scanner.nextLine();
        return "Name: " +name +", " + "Age: " +age+ ", " + "Salary: " + salary +".";
    }
}
