package com.yzw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class helloWordController {
	 @RequestMapping("/hello")
	    public String hello(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
	                Model model) {
	            model.addAttribute("name", name);
	            return "hello"; // 通过这里跳转到helloworld.jsp
	    }

}
