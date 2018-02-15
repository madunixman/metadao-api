package net.lulli.metadao.api.roles;

import net.lulli.metadao.api.MetaDto;

import java.sql.Connection;
import java.util.List;

public interface MetaDaoAdminInterface<T>
{
    public MetaDto descTable(String tableName, T dbConnection);

    public boolean dropTable(String tableName, T dbConnection);

    public boolean createTable(String tableName, List<String> fields, T dbConnection);
}
