package examenFinal.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import examenFinal.com.entity.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer>{

}
