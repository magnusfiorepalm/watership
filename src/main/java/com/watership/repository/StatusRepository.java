package com.watership.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.watership.model.Status;

public interface StatusRepository extends PagingAndSortingRepository<Status, Long> {

}
