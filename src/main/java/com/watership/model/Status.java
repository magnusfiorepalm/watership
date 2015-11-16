package com.watership.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
public @Data class Status {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private Integer order;

	private Boolean done;

	@ManyToOne
	private Project project;
}
