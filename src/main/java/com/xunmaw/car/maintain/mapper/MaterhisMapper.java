package com.xunmaw.car.maintain.mapper;

import com.xunmaw.car.maintain.entity.Materhis;

public interface MaterhisMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Materhis record);

    int insertSelective(Materhis record);

    Materhis selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Materhis record);

    int updateByPrimaryKey(Materhis record);
}