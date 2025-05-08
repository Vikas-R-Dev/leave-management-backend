package com.vikas.leavemanagementbackend.repository;


import com.vikas.leavemanagementbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // you get findAll(), findById(), save(), delete() for free
}

