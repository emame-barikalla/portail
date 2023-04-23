package com.portail.User.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "login",nullable=false)
    private String login;
    @Column(name = "role_id")
    private Long roleid;
    @Column(name = "password")
    private String password;
    @Column(name = "matricule")
    private String matricule;
    @Column(name = "statut")
    private String statut;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;


   /* @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Role> role = new ArrayList<>();
*/
}

