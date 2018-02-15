package net.lulli.metadao.api;

import java.sql.Connection;
import java.util.List;

public interface MetaDaoReadInterface<T>
{
    public List<MetaDto> runQuery(String sqlInputString, T dbConnection);

    public String getIdField();
}
