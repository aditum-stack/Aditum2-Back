package com.ten.aditum2.back.mapper;

import com.ten.aditum2.back.model.entity.PersonasLabel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonasLabelDao {

    int insert(@Param("pojo") PersonasLabel pojo);

    int insertList(@Param("pojos") List<PersonasLabel> pojo);

    List<PersonasLabel> select(@Param("pojo") PersonasLabel pojo);

    int update(@Param("pojo") PersonasLabel pojo);

}
