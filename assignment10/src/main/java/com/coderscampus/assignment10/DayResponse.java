package com.coderscampus.assignment10;

import java.util.List;

public class DayResponse {

	private List<Meal> meals;        // A list of Meal objects
	private Nutrients nutrients;     // Nutrients for the day
	
	public List<Meal> getMeals() {
		return meals;
	}
	
	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}
	
	public Nutrients getNutrients() {
		return nutrients;
	}
	
	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}
	
}
