package org.self.annotation.apt;

import org.example.annotation.Factory;

@Factory(type = Meal.class, id = "Tiramisu")
public class Tiramisu implements Meal {

	@Override
	public float getPrice() {
		return 4.5f;
	}

}