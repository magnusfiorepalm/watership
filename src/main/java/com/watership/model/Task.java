package com.watership.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
public @Data class Task {

	@Id
	@GeneratedValue
	private Long id;

	private String description;

	@ManyToOne
	private Category category;

	@ManyToOne
	private Epic epic;

	@ManyToOne
	private Sprint sprint;

	@ManyToOne
	private Project project;

}
