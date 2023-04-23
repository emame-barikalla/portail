package com.portail.DemandeModif.Entity;

import com.portail.DemandeModif.enumeration.Statut;
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
@Table(name = "demande_modif")

public class DemandeModification implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "demande_id",nullable=false)
    private Long demandeId;

    @Column(name = "login")
    private String login;
    @Column(name = "description")
    private String description;
    @Column(name = "date_demande")
    private LocalDate date;
    @Enumerated(EnumType.STRING)
    @Column(name = "statut")
    private Statut statut;


}


