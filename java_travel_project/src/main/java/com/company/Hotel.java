package com.company;

public class Hotel extends Country{
    private String CityName;
    private String HotelName;
    private Integer RoomsAvailable;
    private Integer AveragePrice;


    public Hotel() {
        this.CityName = null;
        this.HotelName = null;
        this.RoomsAvailable = 0;
        this.AveragePrice = 0;
    }

    public String getCityName() {
        return CityName;
    }

    public String getHotelName() {
        return HotelName;
    }

    public Integer getRoomsAvailable() {
        return RoomsAvailable;
    }

    public Integer getAveragePrice() {
        return AveragePrice;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public void setRoomsAvailable(Integer roomsAvailable) {
        RoomsAvailable = roomsAvailable;
    }

    public void setAveragePrice(Integer averagePrice) {
        AveragePrice = averagePrice;
    }
}
