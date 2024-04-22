package com.fitness.appointment.dao;

import com.fitness.appointment.entity.Member;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipRepository extends JpaRepository<Member, Long> {
    // 在这里可以定义自定义的数据库操作方法
    @Select("select * from fitness.member where id = #{id}")
    Member findAllById(int id);
}