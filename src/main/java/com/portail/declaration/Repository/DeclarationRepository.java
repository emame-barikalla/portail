package com.portail.declaration.Repository;

import com.portail.declaration.Entity.Declaration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeclarationRepository extends JpaRepository<Declaration,Long> {

}
