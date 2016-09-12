package com.airchina.xn.dao;

import com.airchina.xn.model.Parameters;
import java.util.List;

public interface ParametersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Parameters record);

    Parameters selectByPrimaryKey(Integer id);

    List<Parameters> selectAll();

    int updateByPrimaryKey(Parameters record);
    
    List<Parameters> selectByType(String parameterType);
    
    List<Parameters> selectByName(String parameterName);

}