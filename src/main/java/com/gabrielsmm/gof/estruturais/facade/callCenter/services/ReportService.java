package com.gabrielsmm.gof.estruturais.facade.callCenter.services;

import com.gabrielsmm.gof.estruturais.facade.callCenter.model.Card;
import com.gabrielsmm.gof.estruturais.facade.callCenter.model.Register;

import java.util.List;

public class ReportService {
	private RegisterService registerService;
	
	public ReportService(RegisterService registerService) {
		this.registerService = registerService;
	}

	public void getSumary(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		for(Register reg: registers) {
			System.out.println(String.format("%s\t%.2f\t%s", 
					reg.getStoreName(),
					reg.getValue(),
					reg.getDate().toString()
					));
		}
	}

}
