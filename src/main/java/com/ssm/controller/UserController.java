package com.ssm.controller;

import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "add")
    public String  add(User user, HttpServletRequest request){
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        user.setName(name);
        user.setPassword(password);
        int i = userService.add(user);
        if (i>0){
            return "redirect:/findAll";
        }
       return "add";
    }

    @ResponseBody
    @RequestMapping(value = "selectUserAsJson")
    public List<User> selectUserAsJson(String id){
        List<User> users = new ArrayList<User>();
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("id",id);
        users = userService.findAll(map);
        return users;
    }

    @RequestMapping(value = "findAll")
    public ModelAndView selectUserAsJsp(String id){
        List<User> users = new ArrayList<User>();
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("id",id);
        users = userService.findAll(map);
        ModelAndView model = new ModelAndView();
        model.addObject("users",users);
        model.setViewName("index");
        return model;
    }
}
