package com.portail.User.Service;

import com.portail.User.Entity.User;
import com.portail.User.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    private final UserRepository repos;
    public UserService(UserRepository repos) {
        this.repos = repos;
    }
    @Override
    public List<User> findAllusers() {
        return repos.findAll();
    }
    @Override
    public User saveUser(User user) {
        return repos.save(user);
    }
    @Override
    public User updateUser(User user) {
        return repos.save(user);
    }
    @Override
    public void deleteUser(String login) {
        repos.deleteById(login);
    }
}

