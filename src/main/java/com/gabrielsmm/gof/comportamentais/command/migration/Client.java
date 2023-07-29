package com.gabrielsmm.gof.comportamentais.command.migration;

import com.gabrielsmm.gof.comportamentais.command.migration.commands.ProductTable;
import com.gabrielsmm.gof.comportamentais.command.migration.commands.UserTable;
import com.gabrielsmm.gof.comportamentais.command.migration.commands.UserTableRoleColumn;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Client {

    public static void main(String[] args) {
        Map<String, List<String>> database = new LinkedHashMap<>();
        MigrationTool tool = new MigrationTool();
        tool.addMigration(new ProductTable(database));
        tool.addMigration(new UserTable(database));
        tool.addMigration(new UserTableRoleColumn(database));

        System.out.println(database);

        tool.up();
        System.out.println(database);

        tool.up();
        System.out.println(database);

        tool.up();
        System.out.println(database);

        tool.up();
        System.out.println(database);

        tool.down();
        System.out.println(database);

        tool.down();
        System.out.println(database);

        tool.down();
        System.out.println(database);

        tool.down();
        System.out.println(database);

        tool.latest();
        System.out.println(database);

        tool.roolback();
        System.out.println(database);
    }

}
