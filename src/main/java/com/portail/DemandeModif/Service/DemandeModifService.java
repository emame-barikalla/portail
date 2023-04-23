package com.portail.DemandeModif.Service;

import com.portail.DemandeModif.Entity.DemandeModification;
import com.portail.DemandeModif.Repository.DemandeModifRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemandeModifService implements IDemandeService {
    private final DemandeModifRepository repos;
    public DemandeModifService(DemandeModifRepository repos) {
        this.repos = repos;
    }
    @Override
    public List<DemandeModification> findAllDemandes() {
        return repos.findAll();
    }
    @Override
    public Optional<DemandeModification> findById(Long id) {
        return repos.findById(id);
    }
    @Override
    public DemandeModification saveDemande(DemandeModification demandeModification) {
        return repos.save(demandeModification);
    }
    @Override
    public DemandeModification updateDemande(DemandeModification demandeModification) {
        return repos.save(demandeModification);
    }
    @Override
    public void deletedemande(Long id) {
        repos.deleteById(id);
    }
}

