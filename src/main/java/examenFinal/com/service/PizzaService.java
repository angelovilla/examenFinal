package examenFinal.com.service;

import java.util.List;

import examenFinal.com.entity.Pizza;

public interface PizzaService {
	
	List<Pizza> listar();

	Pizza find(Integer id);

	Pizza save(Pizza a);
	
	void delete(Integer id);
	

}
