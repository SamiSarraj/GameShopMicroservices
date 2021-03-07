package com.gameshop.userservice.controller;

import com.gameshop.userservice.domain.User;
import com.gameshop.userservice.dto.UserDto;
import com.gameshop.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void addNewUser(@RequestBody UserDto userDto) {
        userService.addNewUser(userDto);
    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{username}")
    public Optional<User> getUser(@PathVariable String username) {
        return userService.getUser(username);
    }

}
