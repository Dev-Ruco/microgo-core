package com.felisberto.microgo.repository;

import com.felisberto.microgo.entity.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
}