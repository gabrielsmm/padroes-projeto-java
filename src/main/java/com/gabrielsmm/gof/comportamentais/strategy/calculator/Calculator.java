package com.gabrielsmm.gof.comportamentais.strategy.calculator;

import com.gabrielsmm.gof.comportamentais.strategy.calculator.strategies.OperationStrategy;

public class Calculator {

    private final double num1;
    private final double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getResult(OperationStrategy strategy) {
        return strategy.calculate(num1, num2);
    }

}
