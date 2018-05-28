package com.ventura.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventura.poc.models.Operadora;

public interface OperadoraRepository extends JpaRepository<Operadora,String>{
	
	Operadora findByCodigo(Long codigo);
}
