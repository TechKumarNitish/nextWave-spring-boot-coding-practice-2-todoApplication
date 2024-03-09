// Write your code here
package com.example.todo;

import com.example.todo.Todo;
import java.util.ArrayList;

/**
 * TodoRepository
 */
public interface TodoRepository {

    ArrayList<Todo> getTodos();

    Todo getTodoById(int id);

    Todo updateTodo(int id, Todo todo);

    Todo addTodo(Todo todo);

    void deleteTodo(int id);
}