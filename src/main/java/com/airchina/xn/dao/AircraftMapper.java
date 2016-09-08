package com.airchina.xn.dao;

import com.airchina.xn.model.Aircraft;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AircraftMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Aircraft record);

    Aircraft selectByPrimaryKey(Integer id);

    List<Aircraft> selectAll();

    int updateByPrimaryKey(Aircraft record);
    
    Aircraft selectByRegNo(String regno);

	List<Aircraft> selectByType(@Param("Type_Catalog") String typecatalog, @Param("Type_Of_Aircraft")String typeafaircraft);
    
	int insertWithoutID(Aircraft record);
}