package com.dio.santander.bankline.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankline.api.model.Transition;

public interface TransitionRepository extends JpaRepository<Transition, Integer> {

	public List<Transition>findByAccountId(Integer accountId);
}
