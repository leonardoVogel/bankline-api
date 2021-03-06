package com.dio.santander.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.dto.NewTransition;
import com.dio.santander.bankline.api.model.Transition;
import com.dio.santander.bankline.api.repository.TransitionRepository;
import com.dio.santander.bankline.api.service.TransitionService;

@RestController
@RequestMapping("/transitions")
public class TransitionController {
	@Autowired
	private TransitionRepository repository;
	
	@Autowired
	private TransitionService service;
	
	@GetMapping
	public List<Transition> findAll() {
		return repository.findAll();
	}
	
	@GetMapping("/{accountId}")
	public List<Transition> findAll(@PathVariable("accountId") Integer accountId){
		return repository.findByAccountId(accountId);
	}

	@PostMapping
	public void save(@RequestBody NewTransition transition) {
		service.save(transition);
	}
}
