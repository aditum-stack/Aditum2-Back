package com.ten.aditum2.back.mapper;

import com.ten.aditum2.back.model.entity.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonDao {

    int insert(@Param("pojo") Person pojo);

    int insertList(@Param("pojos") List<Person> pojo);

    List<Person> select(@Param("pojo") Person pojo);

    int update(@Param("pojo") Person pojo);

}
