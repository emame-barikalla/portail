package com.portail.declaration.Service;

import com.portail.declaration.Entity.Declaration;

import java.util.List;
import java.util.Optional;

public interface IDeclarationService {
    List<Declaration> findAlldeclarations();
    Optional<Declaration> findById(Long id);
    Declaration savedeclaration(Declaration declaration);
    Declaration updatedeclaration(Declaration declaration);
    void deletedeclaration(Long id);
}
