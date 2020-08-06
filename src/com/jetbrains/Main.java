package com.jetbrains;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            String operation;
            Scanner scn = new Scanner(System.in);
            Parameters abc = new Parameters();
            Calc calculator = new Calc();
            Validator check = new Validator();

            System.out.println("___________________________________");
            System.out.println("  *Wybierz operacje: ");
            System.out.println("  *Suma |+|");
            System.out.println("  *Różnica |-|");
            System.out.println("  *Iloczyn |*|");
            System.out.println("  *Iloraz |/|");
            System.out.println("  *Reszta z dzielenia |%|");
            System.out.println("  *Potęgowanie |^|");
            System.out.println("  *wyjscie: |exit|");
            System.out.println("----------------------------------");

            operation = scn.nextLine();


            System.out.println("podaj pierwsza liczbe: ");
            check.validateUserInput(scn);
            abc.param1 = scn.nextDouble();

            System.out.println("podaj druga liczbe: ");
            check.validateUserInput(scn);
            abc.param2 = scn.nextDouble();

            double result = calc(operation, abc);
            System.out.println(String.format("Result %f", result));
        }
    }

    public static double calc(String operation, Parameters params) {

        double result = 0;
        Calc calculator = new Calc();
        Scanner scn = new Scanner(System.in);

        switch (operation) {
            case "+": {
                result = calculator.addition(params);
                break;
            }
            case "-": {
                result = calculator.subtraction(params);
                break;
            }
            case "*": {
                result = calculator.multiplication(params);
                break;
            }
            case "/": {
                if (params.param2 == 0) {
                    System.out.println("nie dziel cholero przez 0!");
                } else {
                    result = calculator.division(params);
                }
                break;
            }
            case "%": {
                if (params.param2 == 0) {
                    System.out.println("nie dziel cholero przez 0!");

                } else {
                    result = calculator.remainder(params);
                }
                break;
            }
            case "^": {
                result = calculator.exponentiation(params);
                break;
            }

            default: {
                System.out.println("podaj operacje!");
                scn.nextLine();
            }
        }
        return result;
    }
}