package com.user.dao;


import com.user.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao  {

    UserEntity getById(@Param("id") String id);
}
