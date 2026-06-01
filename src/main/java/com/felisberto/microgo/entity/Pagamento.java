package com.felisberto.microgo.entity;

import com.felisberto.microgo.enums.EstadoPagamento;
import com.felisberto.microgo.enums.MetodoPagamento;
import com.felisberto.microgo.enums.TipoPagamento;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "pagamentos")
@Getter
@Setter
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataPagamento;

    private BigDecimal valorPago;

    private BigDecimal valorJuroPago;

    private BigDecimal valorCapitalPago;

    private BigDecimal valorMultaPaga;

    @Enumerated(EnumType.STRING)
    private TipoPagamento tipoPagamento;

    @Enumerated(EnumType.STRING)
    private MetodoPagamento metodoPagamento;

    @Enumerated(EnumType.STRING)
    private EstadoPagamento estado;

    private String observacao;

    @ManyToOne
    @JoinColumn(name = "emprestimo_id")
    private Emprestimo emprestimo;
}