package io.github.wagnerferreira1302.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.wagnerferreira1302.model.Cliente;
import io.github.wagnerferreira1302.repository.ClienteRepository;

@Service
public class ClienteService {
    
	
	private ClienteRepository repository;
    
	@Autowired
	public ClienteService(ClienteRepository repository) {
		this.repository = repository;
	}

	private void salvarCliente(Cliente cliente) {
		validarCliente(cliente);
		repository.persistir(cliente);
	}

	private void validarCliente(Cliente cliente) {
		// aplica algumas validações
	}
}
