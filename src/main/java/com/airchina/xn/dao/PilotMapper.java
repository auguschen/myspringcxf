package com.airchina.xn.dao;

import com.airchina.xn.model.Pilot;
import java.util.List;

public interface PilotMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pilot record);

    Pilot selectByPrimaryKey(Integer id);

    List<Pilot> selectAll();

    int updateByPrimaryKey(Pilot record);
}