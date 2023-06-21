package com.gabrielsmm.gof.estruturais.bridge.converter;

import com.gabrielsmm.gof.estruturais.bridge.converter.converters.CSVConverter;
import com.gabrielsmm.gof.estruturais.bridge.converter.converters.Converter;
import com.gabrielsmm.gof.estruturais.bridge.converter.converters.JsonConverter;
import com.gabrielsmm.gof.estruturais.bridge.converter.employees.Employee;
import com.gabrielsmm.gof.estruturais.bridge.converter.employees.ITGuy;
import com.gabrielsmm.gof.estruturais.bridge.converter.employees.ProjectManager;

public class Client {

	public static void main(String[] args) {
		Converter csvConverter = new CSVConverter();
		Converter jsonConverter = new JsonConverter();

		Employee it = new ITGuy("Maurice Brown", 34, 4000d);
		Employee pm = new ProjectManager("Jen Barber", 40, 6000d);

		System.out.println(csvConverter.getEmployeeFormated(it));
		System.out.println(jsonConverter.getEmployeeFormated(it));
		System.out.println(csvConverter.getEmployeeFormated(pm));
		System.out.println(jsonConverter.getEmployeeFormated(pm));
	}
}
