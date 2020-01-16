package io.github.madushanka.pos.dao;


import io.github.madushanka.pos.entity.OrderDetail;
import io.github.madushanka.pos.entity.OrderDetailPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, OrderDetailPK> {

    @Query(value = "SELECT CASE WHEN EXISTS(SELECT * FROM OrderDetail WHERE Item_id=?1) THEN 'true' ELSE 'false' END",nativeQuery = true)
    boolean existsByItemCode(String itemCode);

}
