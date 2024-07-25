package com.coderscampus.assignment10;


import com.fasterxml.jackson.annotation.JsonProperty;

public class MealPlannerResponse {

	
	
	@JsonProperty("timeFrame")
	private timeFrame timeFrame;
	
	@JsonProperty("Time Series (5min)")
	private TimeSeries timeSeries;
	
	public MetaData getMetaData() {
		return metaData;
	}
	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}
	public TimeSeries getTimeSeries() {
		return timeSeries;
	}
	public void setTimeSeries(TimeSeries timeSeries) {
		this.timeSeries = timeSeries;
	}
	
	
}
