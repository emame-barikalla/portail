package com.portail.User.Service;

import com.portail.User.Entity.User;

import java.util.List;


public interface IUserService {
    List<User> findAllusers();
    User saveUser(User user);
    User updateUser(User user);
    void deleteUser(String login);
    /*Optional<User> findByName(String nom);*/
}

