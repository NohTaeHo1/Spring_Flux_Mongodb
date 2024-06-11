package com.example.demo.security.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;



@Repository
public class UserRepository {

    Boolean existsByEmail(String email);

}
