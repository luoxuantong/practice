package me.anmt.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import me.anmt.ssm.pojo.User;
import me.anmt.ssm.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

      @RequestMapping(value="/user/{uid}", method=RequestMethod.GET)
    public ModelAndView queryUserById(@PathVariable("uid") Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        if (id > 0) {
            User user = userService.getUserById(id);
            modelAndView.addObject("msg", user);
        }
        modelAndView.addObject("msg", "empty");
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
