package com.nc.bean;


import com.nc.validator.ValidationGroup1;
import com.nc.validator.ValidationGroup2;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
    @NotNull(message = "{student.id.notnull}", groups = ValidationGroup1.class)
    private Integer id;
    @NotEmpty(message = "{student.name.notnull}", groups = {ValidationGroup1.class, ValidationGroup2.class})
    @Size(min = 2,max = 10, message = "{student.name.length}", groups = {ValidationGroup1.class, ValidationGroup2.class})
    private String name;

    private String email;
    @Max(150)
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
