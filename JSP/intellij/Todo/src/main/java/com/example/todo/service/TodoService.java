package com.example.todo.service;


import com.example.todo.domain.TodoDTO;
import com.sun.tools.javac.comp.Todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

    public List<TodoDTO> getTodoList() {

        List<TodoDTO> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new TodoDTO(i + 1, "todo" + i, "2022-12-25", false));
        }


        return list;
    }
}
