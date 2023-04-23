package com.portail.User.Controller;

import com.portail.User.Entity.User;
import com.portail.User.Service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("API pour les opérations CRUD sur les utilisateurs.")
@RestController
@RequestMapping("/api/users")
public class UserController {
    private final IUserService iuserService;
    public UserController(IUserService iuserService) {
        this.iuserService = iuserService;
    }
    @ApiOperation(value = "Récupère la liste des utilisateurs ")
    @GetMapping
    public List<User> findAllUsers() {
        return iuserService.findAllusers();
    }
    @ApiOperation(value = "ajouter un utilisateur ")
    @PostMapping("/add")
    public User saveUser(@RequestBody User user) {
        return iuserService.saveUser(user);
    }
    @ApiOperation(value = "modifier un utilisateur ")
    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        return iuserService.updateUser(user);
    }
    @ApiOperation(value = "supprimer un utilisateur ")
    @DeleteMapping("/delete/{id}")
    public void deleteUser(String login) {
        iuserService.deleteUser(login);
    }
}