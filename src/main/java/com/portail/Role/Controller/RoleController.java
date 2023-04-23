package com.portail.Role.Controller;

import com.portail.Role.Entity.Role;
import com.portail.Role.Service.IRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api("API pour les opérations CRUD sur les role.")
@RestController
@RequestMapping("/api/role")
public class RoleController {
    private final IRoleService iroleService;

    public RoleController(IRoleService iroleService) {
        this.iroleService = iroleService;
    }
    @ApiOperation(value = "Récupère la liste des roles ")
    @GetMapping
    public List<Role> findAllRoles() {
        return iroleService.findAllRoles();
    }
    @ApiOperation(value = "Récupère un role grâce à son ID ")
    @GetMapping("/{id}")
    public Optional<Role>  findRoleById(@PathVariable Long id) {
        return iroleService.findById(id);
    }
    @ApiOperation(value = "ajouter un role ")
    @PostMapping("/add")
    public Role saverole(@RequestBody Role role) {
        return iroleService.saverole(role);

    }
    @ApiOperation(value = "modifier un role ")
    @PutMapping("/update")
    public Role updaterole(@RequestBody Role role) {
        return iroleService.updaterole(role);
    }
    @ApiOperation(value = "supprimer un role ")
    @DeleteMapping("/{id}")
    public void deleteroleById(@PathVariable Long id) {
        iroleService.deleterole(id);
    }
}