package com.portail.Role.Service;

import com.portail.Role.Entity.Role;
import com.portail.Role.Repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService implements IRoleService {
    private final RoleRepository repos;
    public RoleService(RoleRepository  repos) {
        this.repos = repos;
    }


    @Override
    public List<Role> findAllRoles() {
        return repos.findAll();
    }

    @Override
    public Optional<Role> findById(Long id) {
        return repos.findById(id);
    }

    @Override
    public Role saverole(Role role) {
        return repos.save(role);
    }

    @Override
    public Role updaterole(Role role) {
        return repos.save(role);
    }

    @Override
    public void deleterole(Long id) {
        repos.deleteById(id);
    }


}

