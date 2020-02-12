package com.itdr.service.impl;

import com.itdr.dao.UserDao;
import com.itdr.dao.UserMapper;
import com.itdr.pojo.Users;
import com.itdr.service.UserService;
import com.mysql.jdbc.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<Users> getAll() {
        List<Users> li = userDao.selectAll();
        return li;
    }

    @Override
    public int addOne() {
        return 0;
    }

    @Override
    public Users login(String username, String password) {
        //参数非空判断
        if (org.springframework.util.StringUtils.isEmpty(username)){
            return null;
        }
        if (org.springframework.util.StringUtils.isEmpty(password)){
            return null;
        }
        //查找用户是否存在
        Users u = userDao.selectByUserNameAddPassWord(username,password);
            if (u == null){
                return null;
            }
            return u;
        }

    @Override
    public List<Users> cc() {
        //创建空集合保存数据
        List<Users> liNew = new ArrayList<Users>();
        //查询所有好友
        List<Users> li = userDao.selectAll();
        //获取当前系统时间的日期
        Calendar c = Calendar.getInstance();
        int i = c.get(Calendar.DAY_OF_MONTH);
        //遍历每个好友，查询好友生日在3天以内
        for (Users users : li){
            Date birthday = users.getBirthDay();
            Calendar c2 = Calendar.getInstance();
            c2.setTime(birthday);
            int i2 = c2.get(Calendar.DAY_OF_MONTH);

            //符合条件的好友放进新集合
            if ((i2-i)>=0 && (i2-i)<=3){
                liNew.add(users);
            }
        }
        return liNew;
    }
}
