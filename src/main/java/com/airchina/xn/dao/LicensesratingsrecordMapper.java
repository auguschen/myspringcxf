package com.airchina.xn.dao;

import com.airchina.xn.model.Licensesratingsrecord;
import java.util.List;

public interface LicensesratingsrecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Licensesratingsrecord record);

    Licensesratingsrecord selectByPrimaryKey(Integer id);

    List<Licensesratingsrecord> selectAll();

    int updateByPrimaryKey(Licensesratingsrecord record);
}