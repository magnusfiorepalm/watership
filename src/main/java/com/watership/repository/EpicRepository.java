package com.watership.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.watership.model.Epic;

public interface EpicRepository extends PagingAndSortingRepository<Epic, Long> {

}
