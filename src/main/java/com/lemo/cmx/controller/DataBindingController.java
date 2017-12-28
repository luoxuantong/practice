package com.lemo.cmx.controller;

import com.lemo.cmx.annotation.Qp;
import com.lemo.cmx.pojo.User;
import com.lemo.cmx.response.Response;
import com.lemo.cmx.response.ReturnMsg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 罗选通 on 2017/12/14.
 */
@Controller
@RequestMapping("databinding")
public class DataBindingController {

  @RequestMapping(value = "/getUrls", method = RequestMethod.GET)
  @ResponseBody
  public ReturnMsg getUrls(@RequestParam(value = "urls") List urls) {
    System.out.println(urls);
    return new ReturnMsg(Response.FAIL, urls);
  }

  @RequestMapping("/dtlist")
  @ResponseBody
  public ReturnMsg query(@Qp User user) {
    System.out.println(user);
    return new ReturnMsg(Response.FAIL, user);
  }

//  @InitBinder
//  public void dataBinder(WebDataBinder binder) {
//    PropertyEditor urlEditor = new PropertyEditorSupport() {
//      @Override
//      public void setValue(Object value) throws IllegalArgumentException {
//        if (value instanceof List) {
//          super.setValue(value);
//        } else if (value.getClass().isArray() && value instanceof String[]) {
//          super.setValue(Lists.newArrayList((String[]) value));
//        }
//      }
//
//      @Override
//      public void setAsText(String text) throws java.lang.IllegalArgumentException {
//        if (text instanceof String) {
//          setValue(Lists.newArrayList(text));
//          return;
//        }
//        throw new IllegalArgumentException(text);
//      }
//    };
//    binder.registerCustomEditor(List.class, urlEditor);
//  }
}
