package com.itdr.pojo.bo;

import com.itdr.pojo.Users;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<Users> {
    @Override
    public Users mapRow(ResultSet resultSet, int i) throws SQLException {
        Users u = new Users();
        u.setId(resultSet.getInt("id"));
        u.setUserName(resultSet.getString("username"));
        u.setPassWord(resultSet.getString("password"));
        u.setImages(resultSet.getString("images"));
        u.setBirthDay(resultSet.getDate("birthday"));
        u.setInterest(resultSet.getString("interest"));
        u.setPhoneNumber(resultSet.getInt("phonenumber"));
        u.setQq(resultSet.getInt("qq"));
        u.setStatus(resultSet.getInt("status"));
        u.setCreate_Time(resultSet.getTime("create_time"));
        u.setUpdate_Time(resultSet.getTime("update_time"));
        return u;
    }
}
