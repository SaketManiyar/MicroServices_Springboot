package com.microservices.departmentservice.model;

//class will be final, only getters no setters --> record properties
public record Employee(Long id, Long department, String name, int salary, String position) {
}
