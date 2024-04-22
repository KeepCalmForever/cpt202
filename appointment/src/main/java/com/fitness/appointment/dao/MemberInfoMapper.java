package com.fitness.appointment.dao;

import com.fitness.appointment.entity.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
@Mapper
public interface MemberInfoMapper {
    @Select("select * from fitness.member")
    List<Member> getMemberData();
}
