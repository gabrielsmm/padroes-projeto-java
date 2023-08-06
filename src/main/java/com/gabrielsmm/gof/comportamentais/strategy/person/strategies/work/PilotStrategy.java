package com.gabrielsmm.gof.comportamentais.strategy.person.strategies.work;

public class PilotStrategy implements WorkStrategy {

	@Override
	public void work() {
		System.out.println("I pilot airplanes to earn a lot of money");
	}

}
