package com.helloworldtechs.solid.o.example1;

import com.helloworldtechs.solid.o.example1.operations.Addition;

import java.security.InvalidParameterException;

public class Calculator {


    public static void main(String[] args) {

        // Initializing Addition as well as declaring
        // its values.
        Addition addition = new Addition();

        // Custom entries
        addition.setValue1(5);
        addition.setValue2(10);

        System.out.println(calculate(addition));
    }

    public static double calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        return operation.perform();
    }
}
