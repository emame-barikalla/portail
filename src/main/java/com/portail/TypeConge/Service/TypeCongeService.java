package com.portail.TypeConge.Service;

import com.portail.TypeConge.Entity.TypeConge;
import com.portail.TypeConge.Repository.TypeCongeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeCongeService implements ITypeService {
    private final TypeCongeRepository repos;
    public TypeCongeService(TypeCongeRepository  repos) {
        this.repos = repos;
    }

    @Override
    public List<TypeConge> findAllTypes() {
        return repos.findAll();
    }

    @Override
    public Optional<TypeConge> findById(Long id) {
        return repos.findById(id);
    }

    @Override
    public TypeConge savetype(TypeConge typeConge) {
        return repos.save(typeConge);
    }

    @Override
    public TypeConge updatetype(TypeConge typeConge) {
        return repos.save(typeConge);
    }

    @Override
    public void deletetype(Long id) {
        repos.deleteById(id);

    }

}

