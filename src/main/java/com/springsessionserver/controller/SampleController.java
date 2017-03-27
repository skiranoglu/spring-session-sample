package com.springsessionserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by seckink on 3/27/2017.
 */
@Controller
public class SampleController {

    @ResponseBody
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, HttpServletRequest request) {
        System.out.println(request.getSession());
        System.out.println(request.getSession().getId());
        System.out.println(request.getCookies());

        System.out.println(request.getParameter("attributeName"));
        System.out.println(request.getParameter("attributeValue"));

        return "greeting " + name;
    }

}
