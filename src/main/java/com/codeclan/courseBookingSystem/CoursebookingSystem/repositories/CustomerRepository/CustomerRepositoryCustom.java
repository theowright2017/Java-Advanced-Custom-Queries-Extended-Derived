package com.codeclan.courseBookingSystem.CoursebookingSystem.repositories.CustomerRepository;

import com.codeclan.courseBookingSystem.CoursebookingSystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> getCustomersByTownAndBookingsCourseId(String town, Long id);

    List<Customer> getCustomerOverCertainAgeByTownAndCourse(int age, String town, Long id);
}
