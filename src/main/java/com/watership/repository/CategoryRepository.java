package com.watership.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.watership.model.Category;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {

}
