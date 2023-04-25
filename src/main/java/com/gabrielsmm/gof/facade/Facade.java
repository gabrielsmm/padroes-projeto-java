package com.gabrielsmm.gof.facade;

import com.gabrielsmm.gof.subsistema1.crm.CrmService;
import com.gabrielsmm.gof.subsistema2.cep.CepApi;

public class Facade {

    // Tornando a interface mais amigável
    public void migrarCliente(String nome, String cep) {

        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

}
