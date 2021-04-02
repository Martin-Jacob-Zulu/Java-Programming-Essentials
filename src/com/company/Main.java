package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input your name : ");
	    String name = input.nextLine();
	    sayHello(name);
    }

    static void sayHello(String name) {
        System.out.printf("Hello %s, Welcome to the new world of java programming.", name);
    }
}
