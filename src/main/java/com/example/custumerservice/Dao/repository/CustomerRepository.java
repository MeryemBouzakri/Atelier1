package com.example.custumerservice.Dao.repository;

import com.example.custumerservice.Dao.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
