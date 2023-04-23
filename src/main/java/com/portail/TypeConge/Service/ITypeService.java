package com.portail.TypeConge.Service;

import com.portail.TypeConge.Entity.TypeConge;

import java.util.List;
import java.util.Optional;

public interface ITypeService {
    List<TypeConge> findAllTypes();
    Optional<TypeConge> findById(Long id);
    TypeConge savetype(TypeConge typeConge);
    TypeConge updatetype(TypeConge typeConge);
    void deletetype(Long id);
}
