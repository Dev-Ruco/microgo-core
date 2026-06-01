package com.felisberto.microgo.controller;

import com.felisberto.microgo.entity.Pagamento;
import com.felisberto.microgo.service.PagamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagamentos")
public class PagamentoController {

    private final PagamentoService pagamentoService;

    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping
    public Pagamento registarPagamento(@RequestBody Pagamento pagamento) {
        return pagamentoService.registarPagamento(pagamento);
    }

    @GetMapping
    public List<Pagamento> listarPagamentos() {
        return pagamentoService.listarPagamentos();
    }
}