package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input your name : ");
	    String name = input.nextLine();
	    readInput();
    }

    static void sayHello(String name) {
        System.out.printf("Hello %s, Welcome to the new world of java programming.", name);
    }

    static void readInput() {
        Scanner input = new Scanner(System.in);
        float weight = 0.0f;
        boolean isValidInput = false;
        while(!isValidInput) {
            try {
                System.out.print("Please enter your weight : ");
                weight = input.nextFloat();
                isValidInput = true;

                if (weight == 0.0f) {
                    System.out.println("Please enter weight above 0.0.");
                    input.nextLine();
                    isValidInput = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error : Ypu must enter a valid number.");
                input.nextLine();
                isValidInput = false;
            }
        }
    }
}
