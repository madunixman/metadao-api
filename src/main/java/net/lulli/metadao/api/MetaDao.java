package net.lulli.metadao.api;


import net.lulli.metadao.api.roles.MetaDaoAdminInterface;
import net.lulli.metadao.api.roles.MetaDaoReadInterface;
import net.lulli.metadao.api.roles.MetaDaoWriteInterface;

public interface MetaDao<T> extends
        MetaDaoAdminInterface<T>,
        MetaDaoReadInterface<T>,
        MetaDaoWriteInterface<T>
{
    String getDialect();

    public void setDialect(String sqlDialect);

}
