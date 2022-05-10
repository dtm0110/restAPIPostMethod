package com.example.clienttaco.model;

import lombok.*;

@Data
@RequiredArgsConstructor
@Getter
@Setter
@NoArgsConstructor(force = true)
public class Ingredient {
	private final String id;
	private final String name;
	private final Type type;

	public static enum Type {
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}
}
