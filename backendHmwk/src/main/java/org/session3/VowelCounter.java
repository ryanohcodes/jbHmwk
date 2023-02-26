package org.session3;

import java.util.Scanner;

public class VowelCounter {
    public static String counter(){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.println("Please type in an sentence");
        String answer = scanner.nextLine().toLowerCase();
        for(int i = 0; i < answer.length();i++){
            char current = answer.charAt(i);
            if(current ==('a') || current ==('u') || current ==('o') || current ==('e') || current ==('i')){
                counter++;
            }
        }

        return "There are " +counter + " vowels";
    }
}
