package com.example.backend.repository;

import com.example.backend.model.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryUserRepository {

    List<User> users;

    @PostConstruct
    public void init() {
        users = new ArrayList<>();
    }

    public boolean doesUserExist(String username) {
        return users.stream().anyMatch(user -> user.getUsername().equals(username));
    }

    public User getUserByUsername(String username) {
        return users.stream().filter(user -> user.getUsername().equals(username)).findFirst().orElse(null);
    }

    public User addUser(User user){
        users.add(user);
        return user;
    }
}
