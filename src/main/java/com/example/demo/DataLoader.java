package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    TodoRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Todo todo;
        todo = new Todo("Study", "NA", "high");
        repository.save(todo);

        todo = new Todo("Math", "NA", "low");
        repository.save(todo);

        todo = new Todo("Something", "today", "Na");
        repository.save(todo);
    }
}
