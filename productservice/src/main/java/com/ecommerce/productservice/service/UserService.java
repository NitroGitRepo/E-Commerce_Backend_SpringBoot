package com.ecommerce.productservice.service;

import com.ecommerce.productservice.models.Instructor;
import com.ecommerce.productservice.models.User;
import com.ecommerce.productservice.repository.InstructorRepository;
import com.ecommerce.productservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final InstructorRepository instructorRepository;

    public  UserService(UserRepository userRepository, InstructorRepository instructorRepository){
        this.userRepository = userRepository;
        this.instructorRepository = instructorRepository;
    }

    public User createUser(String name, String email){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return user;
    }

    public Instructor createInstructor(String name, String email){
        Instructor in = new Instructor();
        in.setName(name);
        in.setEmail(email);
        in.setSalary(20000.0);
        in.setSkill("Flutter/Dart");
        instructorRepository.save(in);
        return in;
    }

    public User getUserByName(String name){
        return userRepository.findByName(name).get();
    }

    public List<Instructor> getInstructorByName(String name){
        return instructorRepository.findByName(name);
    }
//
//    public User getUserByEmail(String name){
//        return userRepository.findByEmail(name).get();
//    }
}
