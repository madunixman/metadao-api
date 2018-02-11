package net.lulli.metadao.api;

import java.sql.Connection;
import java.util.List;

public interface MetaDaoAdminInterface
{
    public MetaDto descTable(String tableName, Connection dbConnection);

    public boolean dropTable(String tableName, Connection dbConnection);

    public boolean createTable(String tableName, List<String> fields, Connection dbConnection);
}
