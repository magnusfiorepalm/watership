package com.watership.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.watership.model.Task;

public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {

}
