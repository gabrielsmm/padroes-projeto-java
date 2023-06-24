package com.gabrielsmm.gof.estruturais.decorator.coffeeShop.model.decorators;

import com.gabrielsmm.gof.estruturais.decorator.coffeeShop.model.Drink;

public abstract class DrinkDecorator implements Drink {

    protected Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }

}
