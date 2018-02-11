package net.lulli.metadao.api;

import java.sql.Connection;
import java.util.Map;

public interface MetaDaoWriteInterface
{
    public Integer insert(MetaDto dto, Connection dbConnection);

    //public Integer execute(String sqlInputString, DataConnection dbConnection);

    public Integer delete(MetaDto dto, WheresMap wheres, Connection dbConnection);

    public Integer update(MetaDto dto, WheresMap wheres, Connection dbConnection);
}
