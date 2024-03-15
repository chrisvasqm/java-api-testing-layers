package org.example.services;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;

public class APIClient<T> {
    private final String baseUrl;
    private final Class<T> type;

    public APIClient(String baseUrl, Class<T> type) {
        this.baseUrl = baseUrl;
        this.type = type;
    }

    public List<T> getAll(String endpoint) {
        return RestAssured.get(baseUrl + endpoint).getBody().jsonPath().getList(".", type);
    }

    public Response post(String endpoint, T body) {
        return RestAssured
                .given()
                .contentType("application/json")
                .body(body)
                .post(baseUrl + endpoint);
    }
}
