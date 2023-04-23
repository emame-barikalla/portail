package com.portail.DemandeAvance.Service;

import com.portail.DemandeAvance.Entity.DemandeAvance;

import java.util.List;
import java.util.Optional;

public interface IDemandeService {
    List<DemandeAvance> findAllDemandes();
    Optional<DemandeAvance> findById(Long id);
    DemandeAvance saveDemande(DemandeAvance demandeAvance);
    DemandeAvance updateDemande(DemandeAvance demandeAvance);
    void deletedemande(Long id);
}
