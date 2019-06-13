package com.codeclan.courseBookingSystem.CoursebookingSystem.repositories.CourseRepository;

import com.codeclan.courseBookingSystem.CoursebookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

//    List<Course> getAllCourses();

    List<Course> getCoursesByRating(int rating);

    List<Course> getCoursesByBookingsCustomerId(Long id);

}
