package com.watership.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
public @Data class Sprint {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private Date startDate;

	private Date endDate;

	@OneToMany(mappedBy = "sprint")
	private List<Task> tasks;

	@ManyToOne
	private Project project;

}
