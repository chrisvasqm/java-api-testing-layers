package org.example.services;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;

public class APIClient<T> {
    private final String baseUrl;
    private final String endpoint;
    private final Class<T> type;

    public APIClient(String endpoint, Class<T> type) {
        this.baseUrl = "https://jsonplaceholder.typicode.com";
        this.endpoint = endpoint;
        this.type = type;
    }

    public List<T> getAll() {
        return RestAssured.get(baseUrl + endpoint).getBody().jsonPath().getList(".", type);
    }

    public Response post(T body) {
        return RestAssured
                .given()
                .contentType("application/json")
                .body(body)
                .post(baseUrl + endpoint);
    }
}
