package com.airchina.xn.dao;

import com.airchina.xn.model.Summaryoflogbooks;
import java.util.List;

public interface SummaryoflogbooksMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Summaryoflogbooks record);

    Summaryoflogbooks selectByPrimaryKey(Integer id);

    List<Summaryoflogbooks> selectAll();

    int updateByPrimaryKey(Summaryoflogbooks record);
}