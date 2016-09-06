package com.airchina.xn.dao;

import com.airchina.xn.model.Flightcheck;
import java.util.List;

public interface FlightcheckMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Flightcheck record);

    Flightcheck selectByPrimaryKey(Integer id);

    List<Flightcheck> selectAll();

    int updateByPrimaryKey(Flightcheck record);
}