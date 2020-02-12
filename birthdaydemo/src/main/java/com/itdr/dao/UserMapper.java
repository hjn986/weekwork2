package com.itdr.dao;

import com.itdr.pojo.Users;
import com.itdr.pojo.bo.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface UserMapper {
     List<Users> selectAll();
     Users selectByUserNameAddPassWord(String username,String password);





}
