package com.felisberto.microgo.controller;

import com.felisberto.microgo.entity.Cliente;
import com.felisberto.microgo.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public Cliente criarCliente(@RequestBody Cliente cliente) {
        return clienteService.criarCliente(cliente);
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }
}