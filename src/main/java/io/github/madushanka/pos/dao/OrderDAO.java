package io.github.madushanka.pos.dao;


import io.github.madushanka.pos.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDAO extends JpaRepository<Order, Integer> {

    int getLastOrderId() ;

    boolean existsByCustomerId(String customerId) ;

}
