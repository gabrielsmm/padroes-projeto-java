package com.gabrielsmm.gof.estruturais.facade.subsistema;

import com.gabrielsmm.gof.estruturais.facade.subsistema.crm.CrmService;
import com.gabrielsmm.gof.estruturais.facade.subsistema.cep.CepApi;

public class Facade {

    // Tornando a interface mais amigável
    public void migrarCliente(String nome, String cep) {

        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

}
