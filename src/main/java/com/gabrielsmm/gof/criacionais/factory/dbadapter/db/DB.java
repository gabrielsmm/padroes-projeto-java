package com.gabrielsmm.gof.criacionais.factory.dbadapter.db;

public interface DB {

    void query(String sql);
    void update(String sql);

}
