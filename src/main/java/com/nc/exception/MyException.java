package com.nc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice//表示这是一个增强的Controller,主要用来做全局处理
public class MyException {
    @ExceptionHandler(Exception.class)/*参数为要拦截的异常 这个表示拦截所有异常*/
    public ModelAndView fileuploadException(Exception e){
        ModelAndView error = new ModelAndView("hello");
        error.addObject("name", e.getMessage());
        return error;
    }
}
