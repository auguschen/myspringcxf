package com.airchina.xn.dao;

import com.airchina.xn.model.Routineflight;
import java.util.List;

public interface RoutineflightMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Routineflight record);

    Routineflight selectByPrimaryKey(Integer id);

    List<Routineflight> selectAll();

    int updateByPrimaryKey(Routineflight record);
}