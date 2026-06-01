package com.felisberto.microgo.entity;

import com.felisberto.microgo.enums.EstadoEmprestimo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "emprestimos")
@Getter
@Setter
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal valorEmprestado;

    private BigDecimal taxaJuroMensal;

    private BigDecimal valorJuroMensal;

    private BigDecimal capitalPago;

    private BigDecimal capitalActual;

    private BigDecimal jurosPagos;

    private BigDecimal jurosEmAtraso;

    private BigDecimal multasAcumuladas;

    private LocalDate dataInicio;

    private Integer diaPagamentoJuro;

    @Enumerated(EnumType.STRING)
    private EstadoEmprestimo estado;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}