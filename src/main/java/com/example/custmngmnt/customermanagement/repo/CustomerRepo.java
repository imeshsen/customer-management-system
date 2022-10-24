package com.example.custmngmnt.customermanagement.repo;

import com.example.custmngmnt.customermanagement.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    Customer getReferenceById(int id);

    List<Customer> findAllByNameEquals(String customerName);
}
