package com.portail.DemandeConge.Service;

import com.portail.DemandeConge.Entity.DemandeConge;
import com.portail.DemandeConge.Repository.DemandeCongeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemandeCongeService implements IDemandeService {
    private final DemandeCongeRepository repos;
    public DemandeCongeService(DemandeCongeRepository repos) {
        this.repos = repos;
    }
    @Override
    public List<DemandeConge> findAllDemandes() {
        return repos.findAll();
    }
    @Override
    public Optional<DemandeConge> findById(Long id) {
        return repos.findById(id);
    }
    @Override
    public DemandeConge saveDemande(DemandeConge demandeConge) {
        return repos.save(demandeConge);
    }
    @Override
    public DemandeConge updateDemande(DemandeConge demandeConge) {
        return repos.save(demandeConge);
    }
    @Override
    public void deletedemande(Long id) {
        repos.deleteById(id);
    }
}

