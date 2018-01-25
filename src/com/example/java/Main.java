package com.example.java;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Using a switch statement to display the users input (number 1-10) as its word in spanish.

        Scanner scanner = new Scanner(System.in); // scanner is used to get input from the user

        String numString;

        System.out.println("Please enter a number between 1-10 to be translated to Spanish: ");

        switch (scanner.nextInt()){

            case 1: numString = "Uno";
                break;
            case 2: numString = "Dos";
                break;
            case 3: numString = "Tres";
                break;
            case 4: numString = "Cuatro";
                break;
            case 5: numString = "Cinco";
                break;
            case 6: numString = "Seis";
                break;
            case 7: numString = "Siete";
                break;
            case 8: numString = "Ocho";
                break;
            case 9: numString = "Nueve";
                break;
            case 10: numString = "Diez";
                break;

            default: numString = "This entry was invalid";

        }
        System.out.println(numString);
    }
}
