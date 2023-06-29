package com.gabrielsmm.gof.estruturais.facade.callCenter;

import com.gabrielsmm.gof.estruturais.facade.callCenter.facade.CallCenterFacade;
import com.gabrielsmm.gof.estruturais.facade.callCenter.model.Card;

public class Client {

	public static void main(String[] args) {
		CallCenterFacade facade = new CallCenterFacade();

		Card card2 = facade.getCardByUser(123456L);
		System.out.println(card2);

		facade.getSumary(card2);

		facade.getPaymentInfoByCard(card2);

		facade.cancelLastRegister(card2);

		Card newCard2 = facade.getCardByUser(123456L);
		System.out.println(newCard2);
	}
}
