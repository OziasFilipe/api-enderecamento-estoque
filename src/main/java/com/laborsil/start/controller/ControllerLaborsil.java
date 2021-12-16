package com.laborsil.start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laborsil.start.controllerrepository.RepositoryController;
import com.laborsil.start.model.ControllerEntity;


@RestController
@RequestMapping("/")
public class ControllerLaborsil {

	@Autowired
	private RepositoryController repositorycontroller;
	
	@GetMapping()
	public String Teste() {
		return "Teste";
	}
	
	@GetMapping("teste")
	public ControllerEntity entity(ControllerEntity entidade) {
		return entidade;
	}
	
	
}
