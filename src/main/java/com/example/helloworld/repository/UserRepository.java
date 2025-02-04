package com.example.helloworld.repository;

import com.example.helloworld.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
