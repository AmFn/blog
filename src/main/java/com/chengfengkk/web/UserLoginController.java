package com.chengfengkk.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.plaf.metal.MetalBorders;

@Controller
public class UserLoginController {
    @RequestMapping("/toLogin")
   public String Login(){
       return "admin/login";
   }
   @RequestMapping("/toIndex")
   public  String toIndex(){
        return "index";
   }
}
