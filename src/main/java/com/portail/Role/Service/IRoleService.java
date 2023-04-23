package com.portail.Role.Service;

import com.portail.Role.Entity.Role;

import java.util.List;
import java.util.Optional;

public interface IRoleService {
    List<Role> findAllRoles();
    Optional<Role> findById(Long id);
    Role saverole(Role role);
    Role updaterole(Role role);
    void deleterole(Long id);
}
