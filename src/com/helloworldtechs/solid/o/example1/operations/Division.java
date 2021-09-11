package com.helloworldtechs.solid.o.example1.operations;

import com.helloworldtechs.solid.o.example1.CalculatorOperation;

public class Division implements CalculatorOperation {

    private double left;
    private double right;
    private double result;

    // constructor, getters and setters
    @Override
    public double perform() {
        if (right != 0) {
           return result = left / right;
        }
        return 0;
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}