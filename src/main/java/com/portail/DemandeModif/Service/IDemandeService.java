package com.portail.DemandeModif.Service;

import com.portail.DemandeModif.Entity.DemandeModification;

import java.util.List;
import java.util.Optional;

public interface IDemandeService {
    List<DemandeModification> findAllDemandes();
    Optional<DemandeModification> findById(Long id);
    DemandeModification saveDemande(DemandeModification demandeModification);
    DemandeModification updateDemande(DemandeModification demandeModification);
    void deletedemande(Long id);
}
