package com.company;

public class Flight {
    private String FlightCode;
    private String FromCode;
    private String ToCode;
    private String DepartureTime;
    private String ArrivalTime;
    private String Company;
    private String Date;
    private String ArrivalDate;
    private Airport airportFrom;
    private Airport airportTo;

    public Flight() {
        this.FlightCode = null;
        this.FromCode = null;
        this.ToCode = null;
        this.DepartureTime = null;
        this.ArrivalTime = null;
        this.Company = null;
        this.Date = null;
        this.ArrivalDate = null;
    }

    public String getFlightCode() {
        return FlightCode;
    }

    public String getFromCode() {
        return FromCode;
    }

    public String getToCode() {
        return ToCode;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public String getCompany() {
        return Company;
    }

    public String getDate() {
        return Date;
    }

    public Airport getAirportFrom() {
        return airportFrom;
    }

    public Airport getAirportTo() {
        return airportTo;
    }

    public String getArrivalDate() {
        return ArrivalDate;
    }

    public void setFlightCode(String flightCode) {
        FlightCode = flightCode;
    }

    public void setFromCode(String fromCode) {
        FromCode = fromCode;
    }

    public void setToCode(String toCode) {
        ToCode = toCode;
    }

    public void setDepartureTime(String departureTime) {
        DepartureTime = departureTime;
    }

    public void setArrivalTime(String arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    public void setCompany(String company) {
        Company = company;
    }


    public void setDate(String date) {
        Date = date;
    }

    public void setAirportFrom(Airport airportFrom) {
        this.airportFrom = airportFrom;
    }

    public void setAirportTo(Airport airportTo) {
        this.airportTo = airportTo;
    }

    public void setArrivalDate(String arrivalDate) {
        ArrivalDate = arrivalDate;
    }
}
