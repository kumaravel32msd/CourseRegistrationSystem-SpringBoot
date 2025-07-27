package com.example.CourseRegistrationSystem.service;

import com.example.CourseRegistrationSystem.model.Course;
import com.example.CourseRegistrationSystem.model.CourseRegistry;
import com.example.CourseRegistrationSystem.repository.CourseRepo;
import com.example.CourseRegistrationSystem.repository.CourseRepositoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;
    @Autowired
    CourseRepositoryRepo courseRepositoryRepo;
    public List<Course> availableCourses() {
       return courseRepo.findAll();
    }

    public List<CourseRegistry> enrolledStudents() {
        return courseRepositoryRepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry = new CourseRegistry(name,emailId,courseName);
        courseRepositoryRepo.save(courseRegistry);
    }
}
