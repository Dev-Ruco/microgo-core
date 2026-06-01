package com.felisberto.microgo.service;

import com.felisberto.microgo.entity.Emprestimo;
import com.felisberto.microgo.repository.EmprestimoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprestimoService {

    private final EmprestimoRepository emprestimoRepository;

    public EmprestimoService(EmprestimoRepository emprestimoRepository) {
        this.emprestimoRepository = emprestimoRepository;
    }

    public Emprestimo criarEmprestimo(Emprestimo emprestimo) {
        return emprestimoRepository.save(emprestimo);
    }

    public List<Emprestimo> listarEmprestimos() {
        return emprestimoRepository.findAll();
    }
}