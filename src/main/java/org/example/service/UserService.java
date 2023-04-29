package org.example.service;

import org.example.entity.User;
import org.example.exceptionProject.UserOutputException;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void deleteUserById(int id);

    List<User> getAllUsers();

    User getUserById(int id) throws UserOutputException;

    void updateUser(User user);

    void deleteAllUsers();

    List<User> getUsersByNumberHouse(int house);
}
