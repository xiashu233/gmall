package com.atguigu.gmall.item.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
//@CrossOrigin
public class ItemController {

    @RequestMapping("index")
    public String index(Model model){

        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ints.add(i);
        }

        model.addAttribute("welcome","welcome to thymeleaf page!!!");
        model.addAttribute("ints",ints);
        model.addAttribute("check",true);
        return "index";
    }
}
