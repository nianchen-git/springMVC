package com.nc.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyInterceptor implements HandlerInterceptor {
    /**
     * preHandle按顺序调用
     * postHandle倒序调用  所有拦截返回true才调用
     * afterCompletion倒叙调用 自己的返回true才调用
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        System.out.println("MyInterceptor: preHandle=====第一个");
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception{
        System.out.println("MyInterceptor: postHandle======第二个");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) throws Exception{
        System.out.println("MyInterceptor: afterCompletion=====第三个");
    }
}
