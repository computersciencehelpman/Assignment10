package com.coderscampus.assignment10;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class Controller {
	
	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam(required = false) String numCalories,
													@RequestParam(required = false) String diet, 
													@RequestParam(required = false) String exclusions){
RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									  .queryParam("timeFrame", "week")
									  .queryParam("targetCalories", numCalories)
									  .queryParam("diet", diet)
									  .queryParam("exclude", exclusions)
									  .queryParam("apiKey", "cbcbfd20344946b09819e0a7d4b6fdb8")
									  .build()
									  .toUri();
		
	//	WeekResponse weekResponse = rt.getForObject(uri, WeekResponse.class);
		
		//Log the generated URI
		System.out.println("Generated URI: " + uri.toString());
		
		//Fetch the raw JSON response as a String
		String jsonResponse = rt.getForObject(uri, String.class);
		
		//Log the raw JSON response
		System.out.println("Raw JSON Response: "+ jsonResponse);
		
		//Convert the JSON response into WeekResponse
		WeekResponse weekResponse = rt.getForObject(uri,  WeekResponse.class);

		return ResponseEntity.ok(weekResponse);
	}

	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(@RequestParam(required = false) String numCalories,
												   @RequestParam(required = false) String diet, 
												   @RequestParam(required = false) String exclusions){
		RestTemplate rt = new RestTemplate();
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
				  .queryParam("timeFrame", "day")
				  .queryParam("targetCalories", numCalories)
				  .queryParam("exclude", exclusions)
				  .queryParam("apiKey", "cbcbfd20344946b09819e0a7d4b6fdb8")
				  .build()
				  .toUri();
		//DayResponse dayResponse = rt.getForObject(uri, DayResponse.class);
		
		//Log the generated URI
				System.out.println("Generated URI: " + uri.toString());
				
				//Fetch the raw JSON response as a String
				String jsonResponse = rt.getForObject(uri, String.class);
				
				//Log the raw JSON response
				System.out.println("Raw JSON Response: "+ jsonResponse);
				
				//Convert the JSON response into WeekResponse
				DayResponse dayResponse = rt.getForObject(uri,  DayResponse.class);


		return ResponseEntity.ok(dayResponse);
	}

	


}
