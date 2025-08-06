package com.example.CourseRegistrationSystem.controller;

import com.example.CourseRegistrationSystem.model.CourseRegistry;
import com.example.CourseRegistrationSystem.model.Users;
import com.example.CourseRegistrationSystem.service.CourseService;
import com.example.CourseRegistrationSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    CourseService courseService;
    @Autowired
    UserService service;

    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledStudents()
    {

        return courseService.enrolledStudents();
    }
    @PostMapping("/add-user")
    public void adduser(@RequestBody Users user)
    {

        service.adduser(user);
    }
}
