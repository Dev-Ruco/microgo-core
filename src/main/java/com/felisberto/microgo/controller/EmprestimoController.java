package com.felisberto.microgo.controller;

import com.felisberto.microgo.entity.Emprestimo;
import com.felisberto.microgo.service.EmprestimoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emprestimos")
public class EmprestimoController {

    private final EmprestimoService emprestimoService;

    public EmprestimoController(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }

    @PostMapping
    public Emprestimo criarEmprestimo(@RequestBody Emprestimo emprestimo) {
        return emprestimoService.criarEmprestimo(emprestimo);
    }

    @GetMapping
    public List<Emprestimo> listarEmprestimos() {
        return emprestimoService.listarEmprestimos();
    }
}