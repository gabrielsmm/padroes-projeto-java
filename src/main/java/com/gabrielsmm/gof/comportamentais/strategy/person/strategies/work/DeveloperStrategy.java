package com.gabrielsmm.gof.comportamentais.strategy.person.strategies.work;

public class DeveloperStrategy implements WorkStrategy {

	@Override
	public void work() {
		System.out.println("I code apps to earn some money");
	}

}
