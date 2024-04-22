package com.fitness.appointment.dao;

import com.fitness.appointment.entity.FitnessPlan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FitnessPlanMapper {
    @Select("select * from fitness.fitness_plan")
    List<FitnessPlan> getFitnessPlanData();
}
