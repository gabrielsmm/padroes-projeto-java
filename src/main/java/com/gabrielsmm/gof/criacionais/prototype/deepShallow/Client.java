package com.gabrielsmm.gof.criacionais.prototype.deepShallow;

import com.gabrielsmm.gof.criacionais.prototype.deepShallow.model.Address;
import com.gabrielsmm.gof.criacionais.prototype.deepShallow.model.User;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User("Clone", 25, new Address("ABC Street", 1000));
		System.out.println(user);
		
		User cloneUser = user.clone();
		cloneUser.name = "Clone x2";
		cloneUser.address.street = "Double Street";
		System.out.println(user);
		System.out.println(cloneUser);
	}
}
