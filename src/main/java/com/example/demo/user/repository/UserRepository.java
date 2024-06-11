package com.example.demo.user.repository;


import com.example.demo.user.model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository  {

    Optional<User> findByUsername(String username);



}