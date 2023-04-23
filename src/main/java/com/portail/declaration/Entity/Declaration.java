package com.portail.declaration.Entity;
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
@Table(name = "declaration_frais")
public class Declaration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "declaration_id",nullable=false)
    private Long id ;
    @Column(name = "login")
    private String login;
    @Column(name = "description")
    private String description;
    @Column(name = "date")
    private LocalDate date;


}
