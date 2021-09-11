package com.helloworldtechs.solid.o.example1;

import com.helloworldtechs.solid.o.example1.operations.Addition;
import com.helloworldtechs.solid.o.example1.operations.Division;
import com.helloworldtechs.solid.o.example1.operations.Multiplication;
import com.helloworldtechs.solid.o.example1.operations.Substraction;

import java.security.InvalidParameterException;

public class Calculator {


    public static void main(String[] args) {

        // Initializing Addition
        Addition addition = new Addition();

        addition.setValue1(20);
        addition.setValue2(20);

        System.out.println(calculate(addition));

        // Initializing Substraction
        Substraction substraction = new Substraction();

        substraction.setValue1(100);
        substraction.setValue2(44);

        System.out.println(calculate(substraction));

        // Initializing Multiplication
        Multiplication multiplication = new Multiplication();

        multiplication.setValue1(10);
        multiplication.setValue2(10);

        System.out.println(calculate(multiplication));

        // Initializing Substraction
        Division division = new Division();

        division.setValue1(100);
        division.setValue2(20);

        System.out.println(calculate(division));


    }

    public static double calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        return operation.perform();
    }
}
