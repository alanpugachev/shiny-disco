package com.alanpugachev.shinydisco.controllers;

import com.alanpugachev.shinydisco.entities.User;
import com.alanpugachev.shinydisco.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser (
            @RequestParam String name,
            @RequestParam String email
    ) {
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        userRepository.save(user);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
