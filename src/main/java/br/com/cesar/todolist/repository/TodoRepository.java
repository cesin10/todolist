package br.com.cesar.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cesar.todolist.entity.Todo;


public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
