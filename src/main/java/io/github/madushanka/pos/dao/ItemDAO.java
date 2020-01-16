package io.github.madushanka.pos.dao;


import io.github.madushanka.pos.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ItemDAO extends JpaRepository<Item, String> {
    @Query(value = "SELECT code FROM Item ORDER BY code DESC LIMIT 1",nativeQuery = true)
    String getLastItemCode();
}
