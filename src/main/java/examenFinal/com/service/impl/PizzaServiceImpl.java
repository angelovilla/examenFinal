package examenFinal.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examenFinal.com.dao.PizzaDAO;
import examenFinal.com.entity.Pizza;
import examenFinal.com.service.PizzaService;

@Service
public class PizzaServiceImpl implements PizzaService{
	
	@Autowired
	PizzaDAO dao;

	@Override
	public List<Pizza> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Pizza find(Integer id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public Pizza save(Pizza a) {
		// TODO Auto-generated method stub
		return dao.save(a);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		
	}

}
