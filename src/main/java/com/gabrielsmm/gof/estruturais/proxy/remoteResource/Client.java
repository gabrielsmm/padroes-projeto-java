package com.gabrielsmm.gof.estruturais.proxy.remoteResource;

import com.gabrielsmm.gof.estruturais.proxy.remoteResource.services.Resource;
import com.gabrielsmm.gof.estruturais.proxy.remoteResource.services.ResourceImpl;
import com.gabrielsmm.gof.estruturais.proxy.remoteResource.services.ResourceProxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Client {

	public static void main(String[] args) throws InterruptedException, IOException {
//		Resource resource = new ResourceImpl();
		Resource resource = new ResourceProxy("v@lid!");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		boolean exit = false;
		while(true) {
			System.out.print("This is your options?:\n\t1-Current date"
					+ "\n\t...Other Options\n\t9-Get Resource's data"
					+ "\n\t0-Exit\nWhat do you want? ");
			String option = buffer.readLine();
			System.out.println("\n\n");
			switch (option) {
				case "1": System.out.println(new Date()); break;
				case "9": System.out.println(resource.getData()); break;
				case "0": exit = true; break;
				default: System.out.println("Processing other options"); break;
			}
			System.out.println("\n\n");
			if(exit) break;
		}
		System.out.println("Bye!");
	}
}
