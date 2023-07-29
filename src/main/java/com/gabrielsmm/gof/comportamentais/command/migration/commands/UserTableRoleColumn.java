package com.gabrielsmm.gof.comportamentais.command.migration.commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserTableRoleColumn extends MigrationCommand {

    public UserTableRoleColumn(Map<String, List<String>> database) {
        super(database);
    }

    @Override
    public void execute() {
        List<String> columns = new ArrayList<>(database.get("User"));
        columns.add("Role");
        database.put("User", columns);
    }

    @Override
    public void undo() {
        List<String> columns = new ArrayList<>(database.get("User"));
        columns.remove("Role");
        database.put("User", columns);
    }

}
