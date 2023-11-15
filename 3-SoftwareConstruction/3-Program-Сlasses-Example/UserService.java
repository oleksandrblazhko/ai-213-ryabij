package com.lab9.airstatechecker.service;

import com.lab9.airstatechecker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService extends JpaRepository<User, Integer> {
}
