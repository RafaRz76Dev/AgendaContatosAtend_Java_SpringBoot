package com.api.AgendaContatos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.AgendaContatos.Models.AgendaContatosModels;
import com.api.AgendaContatos.Repositories.AgendaContatosRepository;

@RestController
@RequestMapping(value ="/agendacontatos")
public class AgendaContatosControllers {
		
	@Autowired //Annotation
	private AgendaContatosRepository repository;
	
	@GetMapping
	public List<AgendaContatosModels>findAll(){ // findAll--> Envia consulta e retorna lista
		List<AgendaContatosModels> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public AgendaContatosModels findById(@PathVariable Long id){  
		AgendaContatosModels result = repository.findById(id).get();
		return result;
	}	
	
	@PostMapping
	public AgendaContatosModels insert(@RequestBody AgendaContatosModels agendacontatos ) {
		AgendaContatosModels result = repository.save(agendacontatos);
		return result;
	}
	
	@PutMapping
	public AgendaContatosModels atualizar(@RequestBody AgendaContatosModels agendacontatos ) {
		AgendaContatosModels result = repository.save(agendacontatos);
		return result;
	
   }
	
	@DeleteMapping
	public void deletaagendacontatos(@RequestBody AgendaContatosModels agendacontatos ) {
	repository.delete(agendacontatos);
		
	}
 }