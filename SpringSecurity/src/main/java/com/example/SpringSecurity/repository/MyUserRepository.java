package com.example.SpringSecurity.repository;

import com.example.SpringSecurity.models.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser,Integer> {


    MyUser findByEmail(String email);
}

