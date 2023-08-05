package com.gabrielsmm.gof.comportamentais.strategy.calculator;

import com.gabrielsmm.gof.comportamentais.strategy.calculator.strategies.AdditionOperation;
import com.gabrielsmm.gof.comportamentais.strategy.calculator.strategies.DivisionOperation;
import com.gabrielsmm.gof.comportamentais.strategy.calculator.strategies.MultiplicationOperation;
import com.gabrielsmm.gof.comportamentais.strategy.calculator.strategies.SubtractionOperation;

public class Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 2);
        System.out.println(calculator.getResult(new AdditionOperation()));
        System.out.println(calculator.getResult(new SubtractionOperation()));
        System.out.println(calculator.getResult(new MultiplicationOperation()));
        System.out.println(calculator.getResult(new DivisionOperation()));
    }

}
