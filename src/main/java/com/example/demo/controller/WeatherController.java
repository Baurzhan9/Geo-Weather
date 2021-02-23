package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
public class WeatherController {

    @GetMapping("/weather")
    public String getWeather() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://weatherapi-com.p.rapidapi.com/forecast.json?q=London&days=0"))
                .header("x-rapidapi-key", "ebcff89758msh71e43ecde40380dp115ea4jsnd8e9b3a56a61")
                .header("x-rapidapi-host", "weatherapi-com.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return response.body();
    }

    @GetMapping("/weather/{name}")
    public String getWeatherByName(@PathVariable String name) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://weatherapi-com.p.rapidapi.com/forecast.json?q=" + name + "&days=0"))
                .header("x-rapidapi-key", "ebcff89758msh71e43ecde40380dp115ea4jsnd8e9b3a56a61")
                .header("x-rapidapi-host", "weatherapi-com.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return response.body();
    }

}
