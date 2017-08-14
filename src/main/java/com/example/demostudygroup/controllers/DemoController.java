package com.example.demostudygroup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demostudygroup.model.*;
import com.example.demostudygroup.dao.*;
@Controller
@RequestMapping("demo")
public class DemoController {
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "demo/index";
    }

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(ModelMap modelMap) {
        modelMap.put("a","Hello LAB1321");
        modelMap.put("b","Hello Scrum Team");
        return "demo/hello";
    }

    @RequestMapping(value = "productinfo", method = RequestMethod.GET)
    public String productInfo(ModelMap modelMap) {
        ProductDAO productDAO = new ProductDAO();
        modelMap.put("product",productDAO.find());
        return "demo/productinfo";
    }


    @RequestMapping(value = "productList", method = RequestMethod.GET)
    public String productList(ModelMap modelMap) {
        ProductDAO productDAO = new ProductDAO();
        modelMap.put("productList",productDAO.findAll());
        return "demo/productList";
    }



}
