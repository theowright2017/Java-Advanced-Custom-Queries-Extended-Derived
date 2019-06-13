package com.codeclan.courseBookingSystem.CoursebookingSystem;

import com.codeclan.courseBookingSystem.CoursebookingSystem.models.Course;
import com.codeclan.courseBookingSystem.CoursebookingSystem.models.Customer;
import com.codeclan.courseBookingSystem.CoursebookingSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.courseBookingSystem.CoursebookingSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.courseBookingSystem.CoursebookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoursebookingSystemApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void findCustomersByTownAndCourse(){

		List<Customer> found = customerRepository.getCustomersByTownAndBookingsCourseId("Glasgow", 1L);
		assertEquals(1, found.size());
	}

//	@Test
//	public void CanGetAllCourses(){
//		List<Course> results = courseRepository.getAllCourses();
//		assertEquals(2, results.size());
//	}

}
