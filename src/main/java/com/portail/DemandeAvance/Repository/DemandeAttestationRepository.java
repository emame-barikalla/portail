package com.portail.DemandeAvance.Repository;

import com.portail.DemandeAvance.Entity.DemandeAvance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandeAttestationRepository extends JpaRepository<DemandeAvance,Long> {

}
