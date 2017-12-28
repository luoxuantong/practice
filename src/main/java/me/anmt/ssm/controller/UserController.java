package me.anmt.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.number.NumberStyleFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.InputStream;

import me.anmt.ssm.exception.MyException;
import me.anmt.ssm.pojo.User;
import me.anmt.ssm.service.UserService;

@Controller
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/user/{uid}", method = RequestMethod.GET)
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

  @RequestMapping(value = "fileupload", method = RequestMethod.GET)
  public ModelAndView fileupd(MultipartFile file) throws IOException {

    InputStream inputStream = file.getInputStream();
//    ModelAndView modelAndView = new ModelAndView();
//    if (id > 0) {
//      User user = userService.getUserById(id);
//      modelAndView.addObject("msg", user);
//    }
//    modelAndView.addObject("msg", "empty");
//    modelAndView.setViewName("hello");
    return null;
  }

  @RequestMapping(value = "/save")
  public ModelAndView save(User user) {
    System.out.println(user.toString());
    if(user.getSex()==null)
      throw new MyException("测试");
    return null;
  }

  @InitBinder
  public void initBinder(DataBinder dataBinder){
    dataBinder.addCustomFormatter(new NumberStyleFormatter());
  }
}
