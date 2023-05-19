package com.gabrielsmm.gof.criacionais.factory.dbadapter.db;

public class OracleDB implements DB {

    @Override
    public void query(String sql) {
        System.out.println("Realizando a consulta " + sql + " no banco de dados Oracle");
    }

    @Override
    public void update(String sql) {
        System.out.println("Realizando a atualização " + sql + " no banco de dados Oracle");
    }

}
