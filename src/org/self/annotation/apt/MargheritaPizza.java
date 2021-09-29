package org.self.annotation.apt;

import org.example.annotation.Factory;

@Factory(type = Meal.class, id = "MargheritaPizza")
public class MargheritaPizza implements Meal {

	@Override
	public float getPrice() {
		return 6.0f;
	}
}