package com.dio.santander.bankline.api.model;

import java.time.LocalDateTime;

public class Transition {
	private Integer id;
	private LocalDateTime dateTime;
	private String description;
	private Double value;
	private TransitionType type;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public TransitionType getType() {
		return type;
	}
	public void setType(TransitionType type) {
		this.type = type;
	}
	
	
}
