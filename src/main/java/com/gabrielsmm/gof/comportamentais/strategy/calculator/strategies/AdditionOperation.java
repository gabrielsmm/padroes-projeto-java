package com.gabrielsmm.gof.comportamentais.strategy.calculator.strategies;

public class AdditionOperation implements OperationStrategy {

    @Override
    public double calculate(double num1, double num2) {
        return num1 + num2;
    }

}
