package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeControllerTest {

    @Test
    void getAllEmployees() {
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add("Employee-" + i);
        }
        Flux<String> employeeName = Flux.fromIterable(arrayList).log();
        employeeName.subscribe(str -> System.out.println(str.toUpperCase()));

    }

    @Test
    void getEmployee() {
        Flux<String> employeeName = Flux.just("Employee Name").log();
        employeeName.subscribe(str -> System.out.println(str.toUpperCase()));
    }
}