package com.jetbrains;

import java.util.Scanner;

public class Validator {
    Main operation = new Main();

    public static void validateUserInput(Scanner scn) {
        while (!scn.hasNextDouble()) {
            System.out.println("podaj liczbe!");
            scn.next();
        }

    }
//
//    public static void validateUserOperation(Scanner scn) {
//
//        if (scn.hasNextLine()) {
//
//        } else {
//            System.out.println("podaj operacje");
//            scn.nextLine();
//        }
//    }

}