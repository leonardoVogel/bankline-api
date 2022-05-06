package com.dio.santander.bankline.api.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.bankline.api.dto.NewTransition;
import com.dio.santander.bankline.api.model.Transition;
import com.dio.santander.bankline.api.model.TransitionType;
import com.dio.santander.bankline.api.repository.TransitionRepository;

@Service
public class TransitionService {
	@Autowired
	private TransitionRepository repository;
	public void save(NewTransition newTransition) {
		Transition transition = new Transition();
		
		Double value = newTransition.getValue();
		if (newTransition.getType() == TransitionType.EXPENSE)
			value = value * -1;
				
		transition.setDateTime(LocalDateTime.now());
		transition.setDescription(newTransition.getDescription());
		transition.setAccountId(newTransition.getAccountId());
		transition.setType(newTransition.getType());
		transition.setValue(value);
		
		repository.save(transition);
	}
}
