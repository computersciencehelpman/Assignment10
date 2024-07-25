package com.coderscampus.assignment10;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam String numCalories, @RequestParam String diet, @RequestParam String exclusions){
		
	}

	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(@RequestParam String numCalories, @RequestParam String diet, @RequestParam String exclusions){

	}



}
