package com.gabrielsmm.gof.estruturais.bridge.converter.converters;

import com.gabrielsmm.gof.estruturais.bridge.converter.employees.Employee;

public interface Converter {
    String getEmployeeFormated(Employee emp);
}
