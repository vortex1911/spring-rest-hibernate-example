package com.vortex.app.service;

import com.vortex.app.model.TodoItem;
import com.vortex.app.repository.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service("todoItemService")
public class TodoItemService {

    @Autowired
    TodoItemRepository todoItemRepository;

    @Transactional
    public List getAllTodoItems() {
        List todoItems = new ArrayList();
        Iterable allTodoItems = todoItemRepository.findAll();
        Iterator countriesIterator = allTodoItems.iterator();
        while (countriesIterator.hasNext()) {
            todoItems.add(countriesIterator.next());
        }
        return todoItems;
    }

    @Transactional
    public TodoItem getTodoItem(int id) {
        return todoItemRepository.findOne(id);
    }

    @Transactional
    public TodoItem addTodoItem(TodoItem todoItem) {
        return todoItemRepository.save(todoItem);
    }

    @Transactional
    public TodoItem updateTodoItem(TodoItem todoItem) {
        return todoItemRepository.save(todoItem);
    }

    @Transactional
    public void deleteTodoItem(int id) {
        todoItemRepository.delete(id);
    }
}
