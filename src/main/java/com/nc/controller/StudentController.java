package com.nc.controller;

import com.nc.bean.Student;
import com.nc.validator.ValidationGroup1;
import com.nc.validator.ValidationGroup2;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {
    @RequestMapping("student")
    public String student(){
        return "addStudent";
    }

    @RequestMapping("addStudent")
    @ResponseBody
    public void addStudent(@Validated(ValidationGroup1.class) Student student, BindingResult result){
        if(result.hasErrors()){
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError allError : allErrors) {
                System.out.println(allError.getObjectName() + ": " + allError.getDefaultMessage());
            }
        }else{
            System.out.println(student);
        }
    }
}
