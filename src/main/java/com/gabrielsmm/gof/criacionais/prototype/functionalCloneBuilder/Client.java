package com.gabrielsmm.gof.criacionais.prototype.functionalCloneBuilder;

import com.gabrielsmm.gof.criacionais.prototype.functionalCloneBuilder.model.Address;
import com.gabrielsmm.gof.criacionais.prototype.functionalCloneBuilder.model.User;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User("ToClone", 25, new Address("ABC Street", 1000));
		System.out.println(user);

		User cloneUser = user.cloneBuilder().name("Cloned").build();
		System.out.println(cloneUser);

		User anotherUser = cloneUser.cloneBuilder()
				.age(100)
				.address(new Address("Rua tal", 200))
				.build();
		System.out.println(anotherUser);
	}
}