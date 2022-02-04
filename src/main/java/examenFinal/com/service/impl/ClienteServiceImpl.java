package examenFinal.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examenFinal.com.dao.ClienteDAO;
import examenFinal.com.entity.Cliente;
import examenFinal.com.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	ClienteDAO dao;

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Cliente find(Integer id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public Cliente save(Cliente a) {
		// TODO Auto-generated method stub
		return dao.save(a);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

}
