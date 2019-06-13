package com.codeclan.courseBookingSystem.CoursebookingSystem.repositories.CustomerRepository;

import com.codeclan.courseBookingSystem.CoursebookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

    List<Customer> getCustomersByBookingsCourseId(Long id);

    List<Customer> getCustomersByTown(String town);

    List<Customer> getCustomersByTownAndBookingsCourseId(String town, Long id);
}
