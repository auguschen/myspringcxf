package com.airchina.xn.dao;

import com.airchina.xn.model.Aircraft;
import java.util.List;

public interface AircraftMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Aircraft record);

    Aircraft selectByPrimaryKey(Integer id);

    List<Aircraft> selectAll();

    int updateByPrimaryKey(Aircraft record);
    
    Aircraft selectByRegNo(String regno);

	List<Aircraft> selectByType(String typecatalog, String typeafaircraft);
    
}