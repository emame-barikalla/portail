package com.portail.DemandeAttestation.Service;

import com.portail.DemandeAttestation.Entity.DemandeAttestation;
import com.portail.DemandeAttestation.Repository.DemandeAttestationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemandeAttestationService implements IDemandeService {
    private final DemandeAttestationRepository repos;
    public DemandeAttestationService(DemandeAttestationRepository repos) {
        this.repos = repos;
    }
    @Override
    public List<DemandeAttestation> findAllDemandes() {
        return repos.findAll();
    }
    @Override
    public Optional<DemandeAttestation> findById(Long id) {
        return repos.findById(id);
    }
    @Override
    public DemandeAttestation saveDemande(DemandeAttestation demandeAttestation) {
        return repos.save(demandeAttestation);
    }
    @Override
    public DemandeAttestation updateDemande(DemandeAttestation demandeAttestation) {
        return repos.save(demandeAttestation);
    }
    @Override
    public void deletedemande(Long id) {
        repos.deleteById(id);
    }
}

