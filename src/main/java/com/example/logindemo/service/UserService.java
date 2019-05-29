package com.example.logindemo.service;

import com.example.logindemo.dao.UserDao;
import com.example.logindemo.model.User;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
   //UserDao dao;
   UserDao dao=new UserDao();

    //判断登陆信息
    public boolean checkUser(String name,String pwd){
        User templeuser=dao.getUserByName(name);
        if(templeuser!=null){
            if(templeuser.getName().equals(name)&&templeuser.getPwd().equals(pwd)){
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }

    //用户注册
    public boolean register(User user){
        long count=dao.insertUser(user);
        if(count>0)
            return true;
        else
            return false;
    }
}
