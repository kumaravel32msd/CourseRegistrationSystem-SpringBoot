package com.example.CourseRegistrationSystem.service;

import com.example.CourseRegistrationSystem.model.Users;
import com.example.CourseRegistrationSystem.repository.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);
    @Autowired
    UserDetailsRepo repo;

    public void adduser(Users user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repo.save(user);
    }
}
