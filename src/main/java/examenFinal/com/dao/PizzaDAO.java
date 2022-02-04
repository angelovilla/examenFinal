package examenFinal.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import examenFinal.com.entity.Pizza;

public interface PizzaDAO extends JpaRepository<Pizza, Integer>{

}
