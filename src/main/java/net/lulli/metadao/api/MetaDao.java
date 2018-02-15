package net.lulli.metadao.api;


public interface MetaDao<T> extends
        MetaDaoAdminInterface<T>,
        MetaDaoReadInterface<T>,
        MetaDaoWriteInterface<T>
{
    String getDialect();

    public void setDialect(String sqlDialect);

}
