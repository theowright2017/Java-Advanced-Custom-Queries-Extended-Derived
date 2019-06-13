package com.codeclan.courseBookingSystem.CoursebookingSystem.controller;


import com.codeclan.courseBookingSystem.CoursebookingSystem.models.Booking;
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
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/date/{date}")
    public List<Booking> getBookingByDate(@PathVariable String date){
        return bookingRepository.getBookingByDate(date);
    }
}
