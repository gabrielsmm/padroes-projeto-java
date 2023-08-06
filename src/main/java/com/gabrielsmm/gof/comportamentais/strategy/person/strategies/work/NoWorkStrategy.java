package com.gabrielsmm.gof.comportamentais.strategy.person.strategies.work;

public class NoWorkStrategy implements WorkStrategy {

	@Override
	public void work() {
		System.out.println("I have no job. Dou you have some money?");
	}

}
