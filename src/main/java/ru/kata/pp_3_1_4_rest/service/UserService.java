package ru.kata.pp_3_1_4_rest.service;

import ru.kata.pp_3_1_4_rest.model.User;

import java.util.List;


public interface UserService {

    public User getUserByEmail(String email);

    public void addUser(User user);

    public User getUserById(int id);

    public void updateUser(User user);

    public void removeUserById(int id);

    public List<User> listUsers();
}