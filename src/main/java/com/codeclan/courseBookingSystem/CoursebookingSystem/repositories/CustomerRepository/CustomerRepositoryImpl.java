package com.codeclan.courseBookingSystem.CoursebookingSystem.repositories.CustomerRepository;

import com.codeclan.courseBookingSystem.CoursebookingSystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> getCustomersByTownAndBookingsCourseId(String town, Long id){
        List<Customer> result = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.createAlias("bookingAlias.course", "courseAlias");
            cr.add(Restrictions.eq("town", town));
            cr.add(Restrictions.eq("courseAlias.id", id));
            result = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Transactional
    public List<Customer> getCustomerOverCertainAgeByTownAndCourse(int age, String town, Long id){
        List<Customer> result = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.createAlias("bookingAlias.course", "courseAlias");
            cr.add(Restrictions.eq("town", town));
            cr.add(Restrictions.gt("age", age));
            cr.add(Restrictions.eq("courseAlias.id", id));
            result = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return result;
    }
}
