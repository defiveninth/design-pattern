package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository {
    public User addUser(User userInput);
    public boolean deleteUser(int id);
    public Optional<List<User>> getUsers();
}