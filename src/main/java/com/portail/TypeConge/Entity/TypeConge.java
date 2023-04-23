package com.portail.TypeConge.Entity;

import com.portail.DemandeConge.Entity.DemandeConge;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "type_conge")
public class TypeConge implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "type_conge_id",nullable=false)
    private Long id ;
    @Column(name = "libelle")
    private String libelle;

   @ManyToOne(cascade = CascadeType.ALL)
    private DemandeConge demandeconge;

}
