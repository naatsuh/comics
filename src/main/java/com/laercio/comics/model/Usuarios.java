package com.laercio.comics.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "cpf", nullable = false)
    private String cpf;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "data_de_nascimento", nullable = false)
    private String dataDeNascimento;


}
