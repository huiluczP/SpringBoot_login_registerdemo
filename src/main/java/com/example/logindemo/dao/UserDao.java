package com.example.logindemo.dao;

import com.example.logindemo.model.User;
import com.example.logindemo.utils.DbUtil;

import java.sql.*;

public class UserDao {

    Connection connection;

    public UserDao(){
        {
            try {
                connection = DbUtil.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public User getUserByName(String name){
        try {
            Statement stm=connection.createStatement();
            String sql;
            sql="select name,pwd from user where name='"+name+"'";
            ResultSet rs =stm.executeQuery(sql);
            if(rs.next()==false){
                return null;
            }
            else{
                User user=new User();
                user.setName(rs.getString("name"));
                user.setPwd(rs.getString("pwd"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
        //test
        /*User user=new User();
        user.setName("mage");
        user.setPwd("123456");
        return user;*/
    }

    public long insertUser(User user){
        int i = 0;
        String sql = "insert into user (name,pwd,email) values(?,?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getPwd());
            pstmt.setString(3, user.getEmail());
            i = pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
