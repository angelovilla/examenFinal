package examenFinal.com.service;

import java.util.List;

import examenFinal.com.entity.Cliente;


public interface ClienteService {

	List<Cliente> listar();

	Cliente find(Integer id);

	Cliente save(Cliente a);
	
	void delete(Integer id);

	
}
