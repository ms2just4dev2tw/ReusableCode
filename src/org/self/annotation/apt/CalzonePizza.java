package org.self.annotation.apt;

import org.example.annotation.Factory;

@Factory(type = Meal.class, id = "CalzonePizza")
public class CalzonePizza implements Meal {

	@Override
	public float getPrice() {
		return 8.5f;
	}
}
