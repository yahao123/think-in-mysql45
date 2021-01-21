package com.wyh.think.in.mysql45.test1.mapper;

import org.apache.ibatis.annotations.Update;

public interface T1Mapper {

    @Update("update t set d=d+1 where id = 7")
    int updatedwherid7();
}
