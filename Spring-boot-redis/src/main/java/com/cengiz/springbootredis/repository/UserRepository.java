package com.cengiz.springbootredis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cengiz.springbootredis.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
