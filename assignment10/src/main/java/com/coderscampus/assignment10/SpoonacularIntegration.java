package com.coderscampus.assignment10;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;



public class SpoonacularIntegration {
	
	
	public void callApiExample() {
		RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate?timeFrame=day")
									  .queryParam("timeFrame", "DAY")
									//  .queryParam("timeFrame", "WEEK")
									  .queryParam("apikey", "8b7557100eeb4124905f42c0d5669e08")
									  .build()
									  .toUri();
		
		URI uri2 = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate?timeFrame=week")
				 // .queryParam("timeFrame", "DAY")
				  .queryParam("timeFrame", "WEEK")
				  .queryParam("apikey", "8b7557100eeb4124905f42c0d5669e08")
				  .build()
				  .toUri();
		
		
		ResponseEntity<MealPlannerResponse> response =  rt.getForEntity(uri, MealPlannerResponse.class);
		System.out.println(response.getBody());
		
		ResponseEntity<MealPlannerResponse> response2 =  rt.getForEntity(uri2, MealPlannerResponse.class);
		System.out.println(response.getBody());
	}

}
