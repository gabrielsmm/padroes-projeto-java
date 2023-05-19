package com.gabrielsmm.gof.criacionais.factory.dbadapter.factory;

import com.gabrielsmm.gof.criacionais.factory.dbadapter.db.DB;
import com.gabrielsmm.gof.criacionais.factory.dbadapter.db.FirebirdDB;
import com.gabrielsmm.gof.criacionais.factory.dbadapter.db.OracleDB;
import com.gabrielsmm.gof.criacionais.factory.dbadapter.db.PostgresDB;

public class DBFactory {

    public DB getDatabase(String nome) {
        return switch(nome) {
            case "Oracle" -> new OracleDB();
            case "Postgres" -> new PostgresDB();
            case "Firebird" -> new FirebirdDB();
            default -> null;
        };
    }

}
