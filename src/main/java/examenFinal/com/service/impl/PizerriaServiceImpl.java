package examenFinal.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examenFinal.com.dao.PizerriaDAO;
import examenFinal.com.entity.Pizerria;
import examenFinal.com.service.PizerriaService;

@Service
public class PizerriaServiceImpl implements PizerriaService{
	
	@Autowired
	PizerriaDAO dao;

	@Override
	public List<Pizerria> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Pizerria find(Integer id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public Pizerria save(Pizerria a) {
		// TODO Auto-generated method stub
		return dao.save(a);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}
