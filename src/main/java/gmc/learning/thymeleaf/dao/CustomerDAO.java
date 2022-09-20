package gmc.learning.thymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import gmc.learning.thymeleaf.entity.Customer;

public interface CustomerDAO extends JpaRepository<Customer, Integer> {

}
