package com.ventura.poc.resources;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
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

import com.ventura.poc.models.Contato;
import com.ventura.poc.repository.ContatoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="API REST Contatos")
@RestController
@RequestMapping("/contato")
public class ContatoResource {
	
	@Autowired
	private ContatoRepository cr;

	
	@ApiOperation(value="Retorna uma lista de Contatos")
	@GetMapping(produces="application/json")
	public @ResponseBody List<Contato> listaContatos(){
		
		Iterable<Contato> listaContatos = cr.findAll();
		
		ArrayList<Contato> contatos = new ArrayList<Contato>();
		for(Contato contato : listaContatos){
			Long codigo = contato.getCodigo();
			contato.add(linkTo(methodOn(ContatoResource.class).contato(codigo)).withSelfRel());
			contatos.add(contato);
		}
		
		
		return contatos;
	}
	
	@ApiOperation(value="Retorna um Contato específico")
	@GetMapping(value="/{codigo}", produces="application/json")
	public @ResponseBody Contato contato(@PathVariable(value="codigo") Long codigo){
		Contato contato = cr.findByCodigo(codigo);
		if(contato!=null) {
			contato.add(linkTo(methodOn(ContatoResource.class).listaContatos()).withRel("Lista de Contatos"));
		}
		return contato;
	}
	
	@ApiOperation(value="Salva um Contato")
	@PostMapping()
	public Contato cadastraContato(@RequestBody @Valid Contato contato){
		
		return cr.save(contato);
	}
	
	@ApiOperation(value="Deleta um Contato")
	@DeleteMapping()
	@Transactional
	public Contato deletaContato(@RequestBody Contato contato){
		cr.deleteContatoByCodigo(contato.getCodigo());
		return contato;
	}
	
}
