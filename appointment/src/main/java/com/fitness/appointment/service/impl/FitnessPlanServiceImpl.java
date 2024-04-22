package com.fitness.appointment.service.impl;

import com.fitness.appointment.dao.FitnessPlanMapper;
import com.fitness.appointment.dao.FitnessPlanRepository;
import com.fitness.appointment.entity.FitnessPlan;
import com.fitness.appointment.service.FitnessPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FitnessPlanServiceImpl implements FitnessPlanService {
    @Autowired
    FitnessPlanMapper fitnessPlanMapper;
//    FitnessPlanRepository fitnessPlanRepository;

    @Override
    public List<FitnessPlan> getFitnessPlanData() {
        return fitnessPlanMapper.getFitnessPlanData();
//        return fitnessPlanRepository.getFitnessPlanData();
    }
}
