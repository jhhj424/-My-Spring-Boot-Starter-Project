package com.example.bootlibrarytest.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class TestController {

    @RequestMapping(value="/", method = { RequestMethod.POST, RequestMethod.GET })
    public ModelAndView index(HttpServletRequest req, Model model) {
        System.out.println("###test");
        return new ModelAndView("/index");
    }

}
