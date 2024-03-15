package org.example.services;

import io.restassured.response.Response;
import org.example.Todo;
import org.example.services.APIClient;

import java.util.List;

public class TodoService {
    private final APIClient<Todo> client;

    public TodoService() {
        this.client = new APIClient<>("https://jsonplaceholder.typicode.com", Todo.class);
    }

    public List<Todo> getAll() {
        return client.getAll("/todos");
    }

    public Response post(Todo todo) {
        return client.post("/todos", todo);
    }
}
