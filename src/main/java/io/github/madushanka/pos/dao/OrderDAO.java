package io.github.madushanka.pos.dao;


import io.github.madushanka.pos.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderDAO extends JpaRepository<Order, Integer> {

    @Query(value = "SELECT IFNULL((SELECT id FROM `order` ORDER BY id DESC LIMIT 1),0)",nativeQuery = true)
    int getLastOrderId() ;

    @Query(value = "SELECT CASE WHEN EXISTS(SELECT * FROM `order` WHERE customerID=?1) THEN 'true' ELSE 'false' END" ,nativeQuery = true)
    boolean existsByCustomerId(String customerId) ;

}
