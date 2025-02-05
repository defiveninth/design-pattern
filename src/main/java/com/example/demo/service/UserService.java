package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final ProductRepository repository;

    @Autowired
    public UserService(ProductRepository repository) {
        this.repository = repository;
    }

    public Optional<List<User>> getUsers() {
        return repository.getUsers();
    }

    public User addUser(User user) {
        return repository.addUser(user);
    }

    public boolean deleteUser(int id) {
        return repository.deleteUser(id);
    }
}
