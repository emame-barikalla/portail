package com.portail.DemandeConge.Entity;

import com.portail.DemandeConge.enumeration.Statut;
import com.portail.TypeConge.Entity.TypeConge;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "demande_conge")

public class DemandeConge implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "demande_id",nullable=false)
    private Long demandeId;
    @Column(name = "type_conge_id")
    private Long typecongeid;
    @Column(name = "login")
    private String login;
    @Column(name = "date_debut")
    
    private LocalDate dateDebut;
    @Column(name = "date_fin")
    private LocalDate dateFin;
    @Column(name = "date_demande")
    private LocalDate date;
    @Column(name = "nbjours")
    private int nbjours;
    @Enumerated(EnumType.STRING)
    @Column(name = "statut")
    private Statut statut;
    @OneToMany(mappedBy = "demandeconge", fetch = FetchType.LAZY)
    private List<TypeConge> typeconge = new ArrayList<>();



}


