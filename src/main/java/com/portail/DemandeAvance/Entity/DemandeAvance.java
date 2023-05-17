package com.portail.DemandeAvance.Entity;

import com.portail.DemandeAvance.enumeration.Statut;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "demande_avance")

public class DemandeAvance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "demande_id",nullable=false)
    private Long demandeId;

    @Column(name = "username")
    private String username;
    @Column(name = "montant")
    private String montant;
    @Column(name = "date_demande")
    private LocalDate date;
    @Enumerated(EnumType.STRING)
    @Column(name = "statut")
    private Statut statut;


}


