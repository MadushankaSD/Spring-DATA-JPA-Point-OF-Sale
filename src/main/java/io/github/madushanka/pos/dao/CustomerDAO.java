package io.github.madushanka.pos.dao;


import io.github.madushanka.pos.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDAO extends JpaRepository<Customer, String> {

    String getLastCustomerId();

}
