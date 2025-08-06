package com.example.CourseRegistrationSystem;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHasher {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
        String pt ="admin1234";
        String hashedpassword = encoder.encode(pt);
        System.out.println(hashedpassword+":");
    }

}
