package com.felisberto.microgo.repository;

import com.felisberto.microgo.entity.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}