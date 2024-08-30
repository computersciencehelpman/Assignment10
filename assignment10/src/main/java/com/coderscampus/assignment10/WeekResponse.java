package com.coderscampus.assignment10;

import java.util.Map;

public class WeekResponse {
    private Map<String, DayResponse> week; // Maps "monday", "tuesday", etc., to a DayResponse

    public Map<String, DayResponse> getWeek() {
        return week;
    }

    public void setWeek(Map<String, DayResponse> week) {
        this.week = week;
    }
}



