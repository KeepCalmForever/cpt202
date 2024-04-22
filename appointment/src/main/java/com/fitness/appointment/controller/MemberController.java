package com.fitness.appointment.controller;

import com.fitness.appointment.entity.Member;
import com.fitness.appointment.entity.Result;
import com.fitness.appointment.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;
    @GetMapping("/membershipData")
    public Result getMembers() {
//        // 连接数据库并查询会员数据
        List<Member> memberList = memberService.getMemberData();

        return Result.success(memberList);
    }
}