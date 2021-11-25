package com.vortex.app.repository;

import com.vortex.app.model.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Integer> {

}
