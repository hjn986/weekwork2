package com.itdr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index/")
public class IndexController {
    //跳转到新增好友页面
    @RequestMapping("addview.do")
    public String toAddView(){
        return "add";
    }
}
