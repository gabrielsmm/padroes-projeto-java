package com.gabrielsmm.gof.comportamentais.iterator.cart;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Client {

    public static void main(String[] args) {
        Cart cart = new Cart(
                new Product("TV", 1000d),
                new Product("Shoe", 59.99d),
                new Product("Pencil", 0.5d)
        );

        for (Product product : cart) {
            System.out.printf("%s = %.2f%n", product.getDescription(), product.getValue());
        }

        Stream<Product> stream = StreamSupport.stream(cart.spliterator(), false);
        Double sum = stream.reduce(0.0, (acc, prod) -> acc + prod.getValue(), Double::sum);
        System.out.println(sum);

        Stream<Product> stream2 = StreamSupport.stream(cart.spliterator(), false);
        Double sum2 = stream2.mapToDouble(Product::getValue).sum();
        System.out.println(sum2);

    }

}
