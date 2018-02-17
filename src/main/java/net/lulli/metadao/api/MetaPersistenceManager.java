package net.lulli.metadao.api;


import java.util.List;


public interface MetaPersistenceManager extends Dialect
{


    //public abstract DbConnectionManager getDbConnectionManager();

    //public List search(MetaDto requestDto, WheresMap wheres);

    //public List search(MetaDto requestDto, WheresMap wheres,  boolean definedAttributes, Integer resultRows);

    public Integer insert(MetaDto dto);

    public Integer update(MetaDto dto, WheresMap wheres);

    public Integer delete(MetaDto dto, WheresMap wheres);

    public Integer save(MetaDto dto, WheresMap wheres);

    public Integer selectCount(MetaDto requestDto, WheresMap wheres, boolean definedAttributes);

    public List<String> descTable(String tableName);

    public boolean createTable(String tableName, List<String> fields);

    public boolean dropTable(String tableName);

    public String getSQLDialect();

    public void setSQLDialect(String sqlDialect);

    public List<MetaDto> runQuery(String sqlInputString);

    //public int execute(String sqlInputString);

}