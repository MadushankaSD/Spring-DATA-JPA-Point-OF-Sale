package io.github.madushanka.pos.dao;


import io.github.madushanka.pos.entity.CustomEntity;

import java.util.List;

public interface QueryDAO {

    List<CustomEntity> getOrderInfo();

}
