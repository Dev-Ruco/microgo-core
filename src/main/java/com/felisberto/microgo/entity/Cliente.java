package com.felisberto.microgo.entity;

import com.felisberto.microgo.enums.EstadoCliente;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeCompleto;

    @Column(nullable = false)
    private String telefonePrincipal;

    private String telefoneAlternativo;

    private String email;

    private String nacionalidade;

    private String estadoCivil;

    private String profissao;

    private String endereco;

    private LocalDate dataNascimento;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoCliente estado = EstadoCliente.ACTIVO;

    private LocalDateTime dataCriacao;

    private LocalDateTime dataActualizacao;
}