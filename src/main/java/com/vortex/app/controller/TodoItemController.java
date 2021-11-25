package com.vortex.app.controller;

import com.vortex.app.model.TodoItem;
import com.vortex.app.service.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoItemController {

    @Autowired
    TodoItemService todoItemService;

    @RequestMapping(value = "/todos", method = RequestMethod.GET, headers = "Accept=application/json")
    public List getTodos() {
        List listOfTodos = todoItemService.getAllTodoItems();
        return listOfTodos;
    }

    @RequestMapping(value = "/todo/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public TodoItem getCountryById(@PathVariable int id) {
        return todoItemService.getTodoItem(id);
    }

    @RequestMapping(value = "/todos", method = RequestMethod.POST, headers = "Accept=application/json")
    public TodoItem addTodo(@RequestBody TodoItem todoItem) {
        return todoItemService.addTodoItem(todoItem);
    }

    @RequestMapping(value = "/todos", method = RequestMethod.PUT, headers = "Accept=application/json")
    public TodoItem updateTodo(@RequestBody TodoItem todoItem) {
        return todoItemService.updateTodoItem(todoItem);
    }

    @RequestMapping(value = "/todoItem/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
    public void deleteCountry(@PathVariable("id") int id) {
        todoItemService.deleteTodoItem(id);

    }

}
