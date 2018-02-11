package net.lulli.metadao.api;


import java.util.Set;

public interface MetaDto extends Cloneable
{
    MetaDto getNewInstance(String tableNameParameter);

    void put(String key, String value);

    String get(String key);

    String getTableName();

    void setTableName(String tableName);

    String getRecordType();

    void setRecordType(String recordType);

    Set<String> keySet();

    boolean containsKey(Object key);

    void remove(String key);

}
