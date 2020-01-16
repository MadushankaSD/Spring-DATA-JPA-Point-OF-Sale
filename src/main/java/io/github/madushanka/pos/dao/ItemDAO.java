package io.github.madushanka.pos.dao;


import io.github.madushanka.pos.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDAO extends JpaRepository<Item, String> {

    String getLastItemCode();
}
