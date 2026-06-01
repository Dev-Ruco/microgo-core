package com.felisberto.microgo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "testemunhos")
@Getter
@Setter
public class Testemunho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCompleto;

    private String numeroDocumento;

    private String telefonePrincipal;

    private String telefoneAlternativo;

    private String endereco;
}