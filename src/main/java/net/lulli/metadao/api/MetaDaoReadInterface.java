package net.lulli.metadao.api;

import java.sql.Connection;
import java.util.List;

public interface MetaDaoReadInterface
{
    public List<MetaDto> runQuery(String sqlInputString, Connection dbConnection);
}
