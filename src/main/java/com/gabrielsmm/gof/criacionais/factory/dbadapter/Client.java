package com.gabrielsmm.gof.criacionais.factory.dbadapter;

import com.gabrielsmm.gof.criacionais.factory.dbadapter.db.DB;
import com.gabrielsmm.gof.criacionais.factory.dbadapter.factory.DBFactory;

public class Client {

    public static void main(String[] args) {
        DBFactory dbFactory = new DBFactory();

        DB db = dbFactory.getDatabase("Postgres");

        if (db != null) {
            db.query("SELECT * FROM CLIENTES");
            db.update("UPDATE CLIENTES SET NOME = 'GABRIEL' WHERE ID = 1");
        }
    }

}
