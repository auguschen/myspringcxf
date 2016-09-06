package com.airchina.xn.dao;

import com.airchina.xn.model.Flighttraining;
import java.util.List;

public interface FlighttrainingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Flighttraining record);

    Flighttraining selectByPrimaryKey(Integer id);

    List<Flighttraining> selectAll();

    int updateByPrimaryKey(Flighttraining record);
}