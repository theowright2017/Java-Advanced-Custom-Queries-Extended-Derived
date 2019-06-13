package com.codeclan.courseBookingSystem.CoursebookingSystem.controller;


import com.codeclan.courseBookingSystem.CoursebookingSystem.models.Course;
import com.codeclan.courseBookingSystem.CoursebookingSystem.models.Customer;
import com.codeclan.courseBookingSystem.CoursebookingSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.courseBookingSystem.CoursebookingSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.courseBookingSystem.CoursebookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/course/{id}")
    public List<Customer> getCustomersByCourse(@PathVariable Long id){
        return customerRepository.getCustomersByBookingsCourseId(id);
    }

    @GetMapping(value = "/town/{town}")
    public List<Customer> getCustomerByTown(@PathVariable String town){
        return customerRepository.getCustomersByTown(town);
    }

    @GetMapping(value = "/town/{town}/course/{id}")
    public List<Customer> getCustomersByTownAndBookingsCourseId(@PathVariable String town, @PathVariable Long id){
        return customerRepository.getCustomersByTownAndBookingsCourseId(town, id);
    }

    @GetMapping(value = "/age/{age}/town/{town}/course/{id}")
    public List<Customer> getCustomerOverCertainAgeByTownAndCourse(@PathVariable int age, @PathVariable String town, @PathVariable Long id){
        return customerRepository.getCustomerOverCertainAgeByTownAndCourse(age, town, id);
    }

//    public List<Customer> getCustomersByTownAndAgeGreaterThanAndBookingsCourseId( String town,int age, Long courseId);
}
