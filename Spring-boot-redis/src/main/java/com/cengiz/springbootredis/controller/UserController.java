package com.cengiz.springbootredis.controller;


import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cengiz.springbootredis.entity.User;
import com.cengiz.springbootredis.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

  private final UserService userService;


  @PostMapping
  public User save(@RequestBody User user) {
    return userService.save(user);
  }
  @GetMapping
  public List<User> findAll() {
    return userService.findAll();
  }
  @GetMapping("/id/{id}")
  public Optional<User> findById(@PathVariable Long id) {
    return userService.findById(id);
  }

}
