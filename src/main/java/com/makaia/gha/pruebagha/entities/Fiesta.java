package com.makaia.gha.pruebagha.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Fiesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column
    private boolean isAseoRealizado;

    @Column
    private boolean isComidaPreparada;

}
