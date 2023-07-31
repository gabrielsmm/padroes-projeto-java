package com.gabrielsmm.gof.comportamentais.iterator.cart;

import java.util.Iterator;
import java.util.List;

public class Cart implements Iterable<Product> {

    private final List<Product> products;

    public Cart(Product... products) {
        this.products = List.of(products);
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

}
