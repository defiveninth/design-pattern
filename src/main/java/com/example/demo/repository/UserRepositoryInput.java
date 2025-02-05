package com.example.demo.repository;

import com.example.demo.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepositoryInput implements ProductRepository {
    List<User> users = new ArrayList<User>();

    @Override
    public User addUser(User userInput) {
        userInput.setId(users.size() + 1);
        users.add(userInput);
        return userInput;
    }

    @Override
    public boolean deleteUser(int id) {
        Optional<User> userToDelete = users.stream()
                .filter(user -> user.getId() == id)
                .findFirst();

        if (userToDelete.isPresent()) {
            users.remove(userToDelete.get());
            return true;
        }
        return false;
    }

    public Optional<List<User>> getUsers() {
        return Optional.ofNullable(users);
    }
}
