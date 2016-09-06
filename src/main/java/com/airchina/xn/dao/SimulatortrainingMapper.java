package com.airchina.xn.dao;

import com.airchina.xn.model.Simulatortraining;
import java.util.List;

public interface SimulatortrainingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Simulatortraining record);

    Simulatortraining selectByPrimaryKey(Integer id);

    List<Simulatortraining> selectAll();

    int updateByPrimaryKey(Simulatortraining record);
}