package net.lulli.metadao.api.roles;

import net.lulli.metadao.api.MetaDto;
import java.util.List;

public interface MetaDaoReadInterface<T>
{
    public List<MetaDto> runQuery(String sqlInputString, T dbConnection);

    public String getIdField();
}
