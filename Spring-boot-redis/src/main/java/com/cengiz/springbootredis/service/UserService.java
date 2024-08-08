package com.cengiz.springbootredis.service;


import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import com.cengiz.springbootredis.entity.User;
import com.cengiz.springbootredis.repository.UserRepository;

@Service
@RequiredArgsConstructor
@EnableCaching
public class UserService {

  private final UserRepository userRepository;


      @Cacheable(value = "user", key = "#user.adi")
      public User save(User user) {
        return userRepository.save(user);
      }

  @Cacheable("users")
  public List<User> findAll() {
    return userRepository.findAll();
  }

  @Cacheable(value = "user", key = "#user.id")
  public Optional<User> findById(Long id) {
        return userRepository.findById(id);
  }




}
