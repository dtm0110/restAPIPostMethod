package com.example.clienttaco.data;

import com.example.ServerTaco.model.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {

}
