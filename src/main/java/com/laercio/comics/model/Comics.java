package com.laercio.comics.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Comics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long comicId;
    private String título;
    @Column(nullable = false)
    private float preco;
    @Column(nullable = false)
    private String autores;
    @Column(nullable = false)
    private String isbn;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private long usuarioid;

}
