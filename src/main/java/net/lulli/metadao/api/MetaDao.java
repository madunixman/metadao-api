package net.lulli.metadao.api;


public interface MetaDao extends MetaDaoAdminInterface, MetaDaoReadInterface, MetaDaoWriteInterface
{
    String getDialect();

    public void setDialect(String sqlDialect);

}
