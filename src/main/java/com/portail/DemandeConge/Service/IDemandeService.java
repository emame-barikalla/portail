package com.portail.DemandeConge.Service;

import com.portail.DemandeConge.Entity.DemandeConge;

import java.util.List;
import java.util.Optional;

public interface IDemandeService {
    List<DemandeConge> findAllDemandes();
    Optional<DemandeConge> findById(Long id);
    DemandeConge saveDemande(DemandeConge demandeConge);
    DemandeConge updateDemande(DemandeConge demandeConge);
    void deletedemande(Long id);
}
