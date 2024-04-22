package com.fitness.appointment.controller;

import com.fitness.appointment.entity.FitnessPlan;
import com.fitness.appointment.entity.Result;
import com.fitness.appointment.service.FitnessPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FitnessPlanController {
    @Autowired
    private FitnessPlanService fitnessPlanService;

//    @GetMapping("/fitnessPlan")
////    public Result getFitnessPlan(){
////        List<FitnessPlan> fitnessPlans = fitnessPlanService.getFitnessPlanData();
////        return Result.success(fitnessPlans);
////    }
//    public String getFitnessPlan(){
//        return "FitnessPlan";

    @GetMapping("/fitnessPlan")
    public String getFitnessPlan(Model model){
//
//        FitnessPlan fitnessPlan = new FitnessPlan();
//        fitnessPlan.setPlan_date("12.1");
//        fitnessPlan.setPlan_level("Silver");
//        fitnessPlan.setPlan_id(2);

        List<FitnessPlan> fitnessPlans = fitnessPlanService.getFitnessPlanData();
        model.addAttribute("fitnessPlan", fitnessPlans);
        System.out.print(fitnessPlans);
        return "FitnessPlan";
    }
}


