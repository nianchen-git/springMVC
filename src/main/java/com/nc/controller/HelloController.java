package com.nc.controller;


import com.nc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

@Controller
public class HelloController{
    @Autowired
    HelloService helloService;

    @RequestMapping("/test")
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println(helloService.hello("筱杰"));
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("name","筱杰");
        return mv;
    }

    /*请求转发*/
    @RequestMapping("/hello1")
    public void hello(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/hello.jsp").forward(req,resp);
    }
    /*重定向*/
    @RequestMapping("/hello2")
    public void hello2(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/hello.jsp");
    }
    /*手动指定响应头去实现重定向*/
    @RequestMapping("hello3")
    public void hello3(HttpServletRequest req, HttpServletResponse resp){
        resp.setStatus(302);
        resp.addHeader("Location","/hello.jsp");
    }
    /*通过HttpServletResponse 给出响应*/
    @RequestMapping("hello4")
    public void hello4(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.write("hello hello4");
        out.flush();
        out.close();
    }
    /*返回ModelAndView Mode自己指定 View是返回值*/
    @RequestMapping("hello5")
    public String hello5(Model model) {
        model.addAttribute("username", "用户名");
        return "hello"; //去找名为hello的视图
    }
    /*服务跳转*/
    @RequestMapping("hello6")
    public String hello6(){
        return "forward:/hello.jsp";
    }
    /*客户端跳转 重定向*/
    @RequestMapping("hello7")
    public String hello7(){
        return "redirect:/hello";
    }

    /*返回真的字符串*/
    @RequestMapping("hello8")
    @ResponseBody
    public String hello8(){
        return "redirect:/hello";
    }

    /*返回真的字符串 防止中文乱码*/
    @RequestMapping(value = "hello9", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String hello9(){
        return "中文返回";
    }
}
