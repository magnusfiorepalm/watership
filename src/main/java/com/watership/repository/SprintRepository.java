package com.watership.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.watership.model.Sprint;

public interface SprintRepository extends PagingAndSortingRepository<Sprint, Long> {

}
