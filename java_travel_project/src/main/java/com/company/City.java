package com.company;

import java.util.ArrayList;

public class City extends Country {
    private String CityName;
    private ArrayList<Airport> Airports;
    private ArrayList<Hotel> Hotels;

    public City() {
        this.CityName = null;
        this.Airports = new ArrayList<Airport>();
    }

    public String getCityName() {
        return CityName;
    }

    public ArrayList<Airport> getAirports() {
        return Airports;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public void setAirports(ArrayList<Airport> airports) {
        Airports = airports;
    }

    public void addAirport(Airport airport) {
        this.Airports.add(airport);
    }
}
