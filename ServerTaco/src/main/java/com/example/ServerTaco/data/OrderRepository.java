package com.example.clienttaco.data;

import com.example.ServerTaco.model.Order;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<Order, String> {

}
