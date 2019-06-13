package com.codeclan.courseBookingSystem.CoursebookingSystem.repositories.BookingRepository;

import com.codeclan.courseBookingSystem.CoursebookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

    List<Booking> getBookingByDate(String date);
}
