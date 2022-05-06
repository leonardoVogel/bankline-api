package com.dio.santander.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.dto.NewClient;
import com.dio.santander.bankline.api.model.Client;
import com.dio.santander.bankline.api.repository.ClientRepository;
import com.dio.santander.bankline.api.service.ClientService;

@RestController
@RequestMapping("/clients")
public class ClientController {
	@Autowired
	private ClientRepository repository;
	
	@Autowired
	private ClientService service;
	
	@GetMapping
	public List<Client> findAll() {
		return repository.findAll();
	}

	@PostMapping
	public void save(@RequestBody NewClient client) {
		service.save(client);
	}
}
