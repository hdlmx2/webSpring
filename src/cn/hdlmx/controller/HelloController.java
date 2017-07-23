package cn.hdlmx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by handong on 2017/7/22.
 */
@Controller
public class HelloController {
    @RequestMapping(value = "hello/test")
    public String hello(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("name","你好");
        return "a/success";
    }
}
