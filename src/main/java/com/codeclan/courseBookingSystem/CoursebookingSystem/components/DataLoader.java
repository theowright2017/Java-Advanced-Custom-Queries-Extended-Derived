package com.codeclan.courseBookingSystem.CoursebookingSystem.components;

import com.codeclan.courseBookingSystem.CoursebookingSystem.models.Booking;
import com.codeclan.courseBookingSystem.CoursebookingSystem.models.Course;
import com.codeclan.courseBookingSystem.CoursebookingSystem.models.Customer;
import com.codeclan.courseBookingSystem.CoursebookingSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.courseBookingSystem.CoursebookingSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.courseBookingSystem.CoursebookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Customer customer1 = new Customer("Tom", "Glasgow", 25);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("John", "Edinburgh", 32);
        customerRepository.save(customer2);
        Customer customer3 = new Customer("James", "Fife", 29);
        customerRepository.save(customer3);

        Course course1 = new Course("Accounting", "Fife", 4);
        courseRepository.save(course1);
        Course course2 = new Course("Science", "Glasgow", 4);
        courseRepository.save(course2);

        Booking booking1 = new Booking("23-06-2019", customer1, course1);
//        booking1.addCourseAndCustomer(course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("30-06-2019", customer2, course2);
//        booking2.addCourseAndCustomer(course2, customer2);
        bookingRepository.save(booking2);

//        Booking booking3 = new Booking("05/07/2019");
//        bookingRepository.save(booking3);






    }
}
