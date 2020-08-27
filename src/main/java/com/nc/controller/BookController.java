package com.nc.controller;

import com.nc.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @RequestMapping("/book")
    public String addBook(){
        return "book";
    }

    @ResponseBody
    @RequestMapping(value = "/doAdd1", method = RequestMethod.POST)
    public void doAdd(@RequestParam(value = "name", required = true, defaultValue = "三国") String bookname, String author, Double price, Boolean ispublic){
        System.out.println(bookname);
        System.out.println(author);
        System.out.println(price);
        System.out.println(ispublic);
    }

    @RequestMapping("/doAdd")
    @ResponseBody
    public void doAdd2(Book book){
        System.out.println(book);
    }
}
