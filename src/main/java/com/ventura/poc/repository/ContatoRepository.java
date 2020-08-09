package com.ventura.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventura.poc.models.Contato;

public interface ContatoRepository extends JpaRepository<Contato,String>{
	
	Contato findByCodigo(Long codigo);
	void deleteContatoByCodigo(Long codigo);

}
