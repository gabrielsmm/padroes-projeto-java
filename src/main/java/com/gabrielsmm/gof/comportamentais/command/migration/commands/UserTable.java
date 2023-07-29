package com.gabrielsmm.gof.comportamentais.command.migration.commands;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class UserTable extends MigrationCommand {

    public UserTable(Map<String, List<String>> database) {
        super(database);
    }

    @Override
    public void execute() {
        List<String> columns = Arrays.asList("Id", "Name", "Email", "Password");
        database.put("User", columns);
    }

    @Override
    public void undo() {
        database.remove("User");
    }

}
