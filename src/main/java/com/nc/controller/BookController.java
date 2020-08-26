package com.nc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @RequestMapping("/book")
    public String addBook(){
        return "book";
    }

    @ResponseBody
    @RequestMapping(value = "/doAdd", method = RequestMethod.POST)
    public void doAdd(String name, String author, Double price, Boolean ispublic){
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);
        System.out.println(ispublic);
    }

}
