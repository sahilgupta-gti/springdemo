package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class EmployeeDTO {
    private long id;
    private String name;
    private double salary;

}
