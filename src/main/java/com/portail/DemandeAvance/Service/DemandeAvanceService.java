package com.portail.DemandeAvance.Service;

import com.portail.DemandeAvance.Entity.DemandeAvance;
import com.portail.DemandeAvance.Repository.DemandeAttestationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemandeAvanceService implements IDemandeService {
    private final DemandeAttestationRepository repos;
    public DemandeAvanceService(DemandeAttestationRepository repos) {
        this.repos = repos;
    }
    @Override
    public List<DemandeAvance> findAllDemandes() {
        return repos.findAll();
    }
    @Override
    public Optional<DemandeAvance> findById(Long id) {
        return repos.findById(id);
    }
    @Override
    public DemandeAvance saveDemande(DemandeAvance demandeAvance) {
        return repos.save(demandeAvance);
    }
    @Override
    public DemandeAvance updateDemande(DemandeAvance demandeAvance) {
        return repos.save(demandeAvance);
    }
    @Override
    public void deletedemande(Long id) {
        repos.deleteById(id);
    }
}

