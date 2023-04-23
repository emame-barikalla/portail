package com.portail.DemandeAttestation.Service;

import com.portail.DemandeAttestation.Entity.DemandeAttestation;

import java.util.List;
import java.util.Optional;

public interface IDemandeService {
    List<DemandeAttestation> findAllDemandes();
    Optional<DemandeAttestation> findById(Long id);
    DemandeAttestation saveDemande(DemandeAttestation demandeAttestation);
    DemandeAttestation updateDemande(DemandeAttestation demandeAttestation);
    void deletedemande(Long id);
}
