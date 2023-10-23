package com.microservices.employeeservice.model;

//class will be final, only getters no setters --> record properties
public record Employee(Long id, Long departmentId, String name, int age, String position) {
}
