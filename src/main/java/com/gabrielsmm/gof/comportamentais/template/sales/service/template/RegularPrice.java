package com.gabrielsmm.gof.comportamentais.template.sales.service.template;

import com.gabrielsmm.gof.comportamentais.template.sales.model.Cart;

public class RegularPrice extends BestOfferTemplate {

	public RegularPrice(Cart cart) {
		super(cart);
	}

	@Override
	public boolean isAppliable() {
		return true;
	}

	@Override
	protected void calibrateVariables() {
		// Nothing to adjust!
	}

}
