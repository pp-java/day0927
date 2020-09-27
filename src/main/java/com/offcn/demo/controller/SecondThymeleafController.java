package com.offcn.demo.controller;


import com.offcn.demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SecondThymeleafController {

    @GetMapping("/second")

    public String indexPage(Model model){

        String message = "Hello, Thymeleaf!";
        User u = new User();
        u.setId(1);
        u.setName("优就业");
        u.setAge(18);

        Map<String,Object>  map=new HashMap<>();

        map.put("src1","1.jpg");
        map.put("src2","2.jpg");

        model.addAttribute("messqge",message);
        model.addAttribute("user", u);
        model.addAttribute("src", map);

        return "index2";
    }


}
