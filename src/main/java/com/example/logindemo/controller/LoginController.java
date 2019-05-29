package com.example.logindemo.controller;

import com.example.logindemo.dao.UserDao;
import com.example.logindemo.service.UserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    //事务类
    UserService userservice=new UserService();

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "login";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){
        Boolean check=false;
        check=userservice.checkUser(name,password);
        if(check) {
            model.put("name",name);
            return "home";
        }
        else{
            model.put("warning","用户名或密码错误");
            return "login";
        }
    }
}
