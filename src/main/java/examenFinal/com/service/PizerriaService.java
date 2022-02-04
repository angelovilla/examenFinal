package examenFinal.com.service;

import java.util.List;

import examenFinal.com.entity.Pizerria;

public interface PizerriaService {

	List<Pizerria> listar();

	Pizerria find(Integer id);

	Pizerria save(Pizerria a);
	
	void delete(Integer id);
	
}
