package com.jetbrains;



public class Calc {



    public static double addition(Parameters params) {
        return params.param1 + params.param2;
    }

    public static double subtraction(Parameters params) {
        return params.param1 - params.param2;
    }

    public static double multiplication(Parameters params) {
        return params.param1 * params.param2;
    }

    public static double division(Parameters params) {
        return params.param1 / params.param2;
    }

    public static double remainder(Parameters params) {
        return params.param1 % params.param2;
    }

    public static double exponentiation(Parameters params) {
        return Math.pow(params.param1, params.param2);
    }
}