package com.company;

import java.util.ArrayList;

public class Airport extends Country {
    private String Code;
    private String CityName;
    private ArrayList<Flight> Departures;
    private ArrayList<Flight> Arrivals;

    public Airport() {
        this.Code = null;
        this.CityName = null;
        this.Departures = new ArrayList<Flight>();
        this.Arrivals = new ArrayList<Flight>();
    }

    public String getCode() {
        return Code;
    }

    public String getCityName() {
        return CityName;
    }

    public ArrayList<Flight> getDepartures() {
        return Departures;
    }

    public ArrayList<Flight> getArrivals() {
        return Arrivals;
    }

    public void setCode(String code) {
        Code = code;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public void setDepartures(ArrayList<Flight> departures) {
        Departures = departures;
    }

    public void setArrivals(ArrayList<Flight> arrivals) {
        Arrivals = arrivals;
    }

    public void addArrival(Flight arrival) {
        this.Arrivals.add(arrival);
    }

    public void addDeparture(Flight departure) {
        this.Departures.add(departure);
    }

    public void delArrival(String flightCode) {
        for (int i = 0; i < Arrivals.size(); i++) {
            if (Arrivals.get(i).getFlightCode().equals(flightCode)) {
                this.Arrivals.remove(i);
                return;
            }
        }
    }

    public void delDeparture(String flightCode) {
        for (int i = 0; i < Departures.size(); i++) {
            if (Departures.get(i).getFlightCode().equals(flightCode)) {
                this.Departures.remove(i);
                return;
            }
        }
    }

}
