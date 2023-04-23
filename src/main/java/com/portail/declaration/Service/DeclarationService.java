package com.portail.declaration.Service;

import com.portail.declaration.Entity.Declaration;
import com.portail.declaration.Repository.DeclarationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeclarationService implements IDeclarationService {
    private final DeclarationRepository repos;
    public DeclarationService(DeclarationRepository repos) {
        this.repos = repos;
    }



    @Override
    public List<Declaration> findAlldeclarations() {
        return repos.findAll();
    }

    @Override
    public Optional<Declaration> findById(Long id) {
        return repos.findById(id);
    }

    @Override
    public Declaration savedeclaration(Declaration declaration) {
        return repos.save(declaration);
    }

    @Override
    public Declaration updatedeclaration(Declaration declaration) {
        return repos.save(declaration);
    }

    @Override
    public void deletedeclaration(Long id) {
        repos.deleteById(id);
    }







}

