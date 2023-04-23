package com.portail.DemandeModif.Repository;

import com.portail.DemandeModif.Entity.DemandeModification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandeModifRepository extends JpaRepository<DemandeModification,Long> {

}
