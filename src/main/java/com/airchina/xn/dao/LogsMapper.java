package com.airchina.xn.dao;

import com.airchina.xn.model.Logs;
import java.util.List;

public interface LogsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Logs record);

    int insertWithoutID(Logs record);

    Logs selectByPrimaryKey(Integer id);

    List<Logs> selectAll();

    int updateByPrimaryKey(Logs record);
    
    List<Logs> selectByCondi(Logs record);
}