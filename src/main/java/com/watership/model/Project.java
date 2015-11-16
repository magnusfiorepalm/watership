package com.watership.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
public @Data class Project {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@OneToMany(mappedBy = "project")
	private List<Sprint> sprints;

	@OneToMany(mappedBy = "project")
	private List<Status> statuses;

	@OneToMany(mappedBy = "project")
	private List<Task> tasks;
}
