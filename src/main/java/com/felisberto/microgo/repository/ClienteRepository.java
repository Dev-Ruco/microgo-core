package com.felisberto.microgo.repository;

import com.felisberto.microgo.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}