package com.projeto.escolar.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.escolar.DTO.UnidadeDTO;
import com.projeto.escolar.entities.UnidadeEntity;
import com.projeto.escolar.repository.UnidadeRepository;

@Service
public class UnidadeService {

	@Autowired
	private UnidadeRepository repo;
	
	public List<UnidadeDTO> chamaDTO(){
		List<UnidadeEntity> result = repo.findAll();
		return result.stream().map(x -> new UnidadeDTO(x)).collect(Collectors.toList());
	}
}
