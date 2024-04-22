package com.fitness.appointment.dao;

import com.fitness.appointment.entity.FitnessPlan;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FitnessPlanRepository {
    @Select("select * from fitness.fitness_plan")
    List<FitnessPlan> getFitnessPlanData();
}
