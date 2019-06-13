package com.codeclan.courseBookingSystem.CoursebookingSystem.controller;


import com.codeclan.courseBookingSystem.CoursebookingSystem.models.Course;
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
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> getAllCoursesWithRatingOf(@PathVariable int rating){
        return courseRepository.getCoursesByRating(rating);
    }

    @GetMapping(value = "/customer/{id}")
    public List <Course> getAllCoursesByCustomer(@PathVariable Long id){
        return courseRepository.getCoursesByBookingsCustomerId(id);
    }


}
