package com.example.logindemo.controller;

import com.example.logindemo.model.User;
import com.example.logindemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {
    //事务类
    UserService userservice=new UserService();

    @RequestMapping(value="/register", method = RequestMethod.GET)
    public String showRegisterPage(ModelMap model){
        return "register";
    }

    @RequestMapping(value="/register", method = RequestMethod.POST)
    public String register(ModelMap model, @RequestParam String name,
                           @RequestParam String password, @RequestParam String email){
        User user=new User();
        user.setName(name);
        user.setPwd(password);
        user.setEmail(email);
        if(userservice.register(user)){
            model.put("name",name);
            return "home";
        }
        else{
            model.put("warning","注册失败");
            return "register";
        }
    }
}
