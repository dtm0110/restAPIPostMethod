package com.example.ServerTaco.data;

import com.example.ServerTaco.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}