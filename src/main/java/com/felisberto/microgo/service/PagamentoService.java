package com.felisberto.microgo.service;

import com.felisberto.microgo.entity.Pagamento;
import com.felisberto.microgo.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagamentoService {

    private final PagamentoRepository pagamentoRepository;

    public PagamentoService(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    public Pagamento registarPagamento(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }

    public List<Pagamento> listarPagamentos() {
        return pagamentoRepository.findAll();
    }
}