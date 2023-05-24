package com.gabrielsmm.gof.estruturais.facade.subsistema.cep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Goiânia";
    }

    public String recuperarEstado(String cep) {
        return "GO";
    }

}
