package com.watership.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.watership.model.Project;

public interface ProjectRepository extends PagingAndSortingRepository<Project, Long> {

}
