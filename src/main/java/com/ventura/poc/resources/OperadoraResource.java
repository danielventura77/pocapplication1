package com.ventura.poc.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ventura.poc.models.Operadora;
import com.ventura.poc.repository.OperadoraRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="API REST Operadoras")
@RestController
@RequestMapping("/operadora")
public class OperadoraResource {
	
	@Autowired
	private OperadoraRepository or;
	
	
	@ApiOperation(value="Retorna uma lista de Operadoras")
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Operadora> listaOperadoras(){
		
		Iterable<Operadora> listaOperadoras = or.findAll();
		return listaOperadoras;
	}
	
	@ApiOperation(value="Retorna uma Operadora específica")
	@GetMapping(value="/{codigo}", produces="application/json")
	public @ResponseBody Operadora operadora(@PathVariable(value="codigo") Long codigo){
		Operadora operadora = or.findByCodigo(codigo);
		return operadora;
	}
	
	@ApiOperation(value="Salva uma Operadora")
	@PostMapping()
	public Operadora cadastraOperadora(@RequestBody @Valid Operadora operadora){
		
		return or.save(operadora);
	}
	
	@ApiOperation(value="Deleta uma Operadora")
	@DeleteMapping()
	public Operadora deletaOperadora(@RequestBody Operadora operadora){
		or.delete(operadora);
		return operadora;
	}

}
