package com.ranjith.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranjith.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
