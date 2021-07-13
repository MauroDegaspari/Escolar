package com.projeto.escolar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.escolar.DTO.UnidadeDTO;
import com.projeto.escolar.services.UnidadeService;

@RestController
@RequestMapping(value= "/escolas")
public class UnidadeController {

	@Autowired
	private UnidadeService service;
	
	@GetMapping
	public ResponseEntity<List<UnidadeDTO>> trazerServico(){
		List<UnidadeDTO> lista =  service.chamaDTO();
		return ResponseEntity.ok(lista);
	}
}
