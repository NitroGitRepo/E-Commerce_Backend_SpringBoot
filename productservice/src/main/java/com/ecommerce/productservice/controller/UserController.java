package com.ecommerce.productservice.controller;

import com.ecommerce.productservice.dtos.CreateUserDto;
import com.ecommerce.productservice.dtos.GetUserDto;
import com.ecommerce.productservice.models.Instructor;
import com.ecommerce.productservice.models.User;
import com.ecommerce.productservice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    //http://localhost:8080/users
    @PostMapping("")
    public User createUser(@RequestBody CreateUserDto createUserDto){
        return userService.createUser(createUserDto.getName(), createUserDto.getEmail());
    }

    //http://localhost:8080/users/instructor
    @PostMapping("/instructor")
    public Instructor createInstructor(@RequestBody CreateUserDto createUserDto){
          return  userService.createInstructor(createUserDto.getName(), createUserDto.getEmail());
    }



    @GetMapping("/1/{name}")
    public User getUserByName(@PathVariable(name = "name") String name){
        return  userService.getUserByName(name);
    }

    @GetMapping("/2/{instructorName}")
    public List<Instructor> getInstructorByName(@PathVariable String instructorName){
        return  userService.getInstructorByName(instructorName);
    }
//
//
//    @GetMapping("/2/{email}")
//    public User getUserByEmail(@PathVariable(name = "email") String email){
//        return  userService.getUserByEmail(email);
//    }
}
