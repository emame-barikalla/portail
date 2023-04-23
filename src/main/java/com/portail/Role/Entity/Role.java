package com.portail.Role.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "role")
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id",nullable=false)
    private Long id ;
    @Column(name = "libelle")
    private String libelle;

   /*@ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "login")
    private User user;*/

}
