package com.gabrielsmm.gof.comportamentais.template.sales.service;

import com.gabrielsmm.gof.comportamentais.template.sales.model.Cart;
import com.gabrielsmm.gof.comportamentais.template.sales.service.template.*;

import java.util.ArrayList;
import java.util.List;

public class BestOfferService {

    private List<BestOfferTemplate> templates;

    public void calculateBestOffer(Cart cart) {
        loadTemplates(cart);
        double bestOffer = Double.MAX_VALUE;
        for (BestOfferTemplate template : templates) {
            if (template.isAppliable()) {
                Double currentPrice = template.calculateOffer(cart);
                System.out.println(String.format("%s: %.2f", template.getClass().getSimpleName(), currentPrice));
                bestOffer = (bestOffer > currentPrice) ? currentPrice : bestOffer;
            }
        }
        System.out.println(String.format("Final Price: %.2f", bestOffer));
    }

    private void loadTemplates(Cart cart) {
        templates = new ArrayList<>();
        templates.add(new RegularPrice(cart));
        templates.add(new FreeDelivery(cart));
        templates.add(new BigCartDiscounts(cart));
        templates.add(new SpecialClient(cart));
        templates.add(new CategoryDiscounts(cart));
        templates.add(new BlackFriday(cart));
    }

}
