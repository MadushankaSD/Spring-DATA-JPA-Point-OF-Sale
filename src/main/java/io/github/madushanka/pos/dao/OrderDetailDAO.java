package io.github.madushanka.pos.dao;


import io.github.madushanka.pos.entity.OrderDetail;
import io.github.madushanka.pos.entity.OrderDetailPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, OrderDetailPK> {

    boolean existsByItemCode(String itemCode);

}
