package com.airchina.xn.dao;

import com.airchina.xn.model.Parameters;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ParametersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Parameters record);

    int insertWithoutID(Parameters record);

    Parameters selectByPrimaryKey(Integer id);

    List<Parameters> selectAll();

    int updateByPrimaryKey(Parameters record);
    
    List<Parameters> selectByType(@Param("ParameterType") String parameterType);
    
    List<Parameters> selectByName(@Param("ParameterName") String parameterName);

}