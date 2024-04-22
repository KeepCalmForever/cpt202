package com.fitness.appointment.service.impl;

import com.fitness.appointment.dao.MemberInfoMapper;
import com.fitness.appointment.dao.MembershipRepository;
import com.fitness.appointment.entity.Member;
import com.fitness.appointment.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

//    @Autowired
//    private MembershipRepository membershipRepository;
    @Autowired
    MemberInfoMapper memberInfoMapper;

    @Override
    public List<Member> getMemberData() {
        return memberInfoMapper.getMemberData();
    }
}