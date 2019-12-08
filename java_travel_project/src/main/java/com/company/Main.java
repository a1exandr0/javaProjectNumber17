package com.company;

import jxl.read.biff.BiffException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;


public class Main {
    private static void addAirportToCity(City city, ArrayList<Airport> airports, String airportCode) {
        for (Airport airport:airports) {
            if (airport.getCode().equals(airportCode)) {
                city.addAirport(airport);
            }
        }
    }

    private static void addFlightToAirport(Airport airport, ArrayList<Flight> flights, String flightCode) {
        for (Flight flight:flights) {
            if (flight.getFlightCode().equals(flightCode)) {
                if (airport.getCode().equals(flight.getToCode())) {
                    airport.addArrival(flight);
                } else if (airport.getCode().equals(flight.getFromCode())) {
                    airport.addDeparture(flight);
                }
            }
        }
    }

    private static Integer TimeToInt(String time) {
        String[] timeArr = time.split(":");
        int res = 0;
        res += Integer.parseInt(timeArr[0])*60;
        res += Integer.parseInt(timeArr[1]);
        return res;
    }

    private static int daysBeetwen(String date1, String date2) {// can not be used for normal dates, because supports only 365day year
        Integer[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Integer days1 = 0;
        Integer days2 = 0;
        String[] date1Arr = date1.split("/");
        String[] date2Arr = date2.split("/");
        days1 += Integer.parseInt(date1Arr[0]);
        days2 += Integer.parseInt(date2Arr[0]);

        for (int i = 0; i < Integer.parseInt(date1Arr[1]); i++) {
            days1 += days[i];
        }

        for (int i = 0; i < Integer.parseInt(date2Arr[1]); i++) {
            days2 += days[i];
        }

        days1 += Integer.parseInt(date1Arr[2]);
        days2 += Integer.parseInt(date2Arr[2]);
        return days2 - days1;
    }

    private static void pathHelper(Airport currentAirport, Airport airport2, HashSet<String> visited, ArrayList<Flight> flights, Integer count, Integer max, String CurTime, String CurDate) {
//        System.out.println(currentAirport.getCode());
//        System.out.println(airport2.getCode());
//        System.out.println(flights);
//        System.out.println(currentAirport.getCode().equals(airport2.getCode()));
        if (currentAirport.getCode().equals(airport2.getCode())) {
            for(Flight flight1:flights) {
                System.out.println(flight1.getFlightCode() + "   ");
            }
            System.out.println("\n");
        }
        for(Flight flight:currentAirport.getDepartures()) {
            Integer timeDiff = TimeToInt(flight.getDepartureTime()) - TimeToInt(CurTime);
            Integer dayDiff = daysBeetwen(CurDate, flight.getDate());
            if (count < max && !(visited.contains(flight.getAirportTo().getCode())) && dayDiff <= 1 && dayDiff >= 0 && timeDiff > 0){
                flights.add(flight);
                visited.add(flight.getAirportFrom().getCode());
                pathHelper(flight.getAirportTo(), airport2, visited, flights, count + 1, max, flight.getArrivalTime(), flight.getArrivalDate());
                flights.remove(flight);
                visited.remove(flight.getAirportFrom().getCode());
            }
        }
    }

    private static void findFligthSequence(Airport airport1, Airport airport2, Integer maxFlights, String Date) {
        pathHelper(airport1, airport2, new HashSet<String>(), new ArrayList<Flight>(), 0, maxFlights, "00:00", Date);
    }

    private static ArrayList<Hotel> findHotels(ArrayList<Hotel> hotels, Integer maxPrice, City city) {
        ArrayList<Hotel> result = new ArrayList<Hotel>();
        for(Hotel hotel:hotels) {
            if (hotel.getCityName().equals(city.getCityName()) && hotel.getAveragePrice() < maxPrice) {
                result.add(hotel);
            }
        }
        return result;
    }



    public static void main(String[] args) throws IOException, BiffException {
        City kiev = new City();
        ArrayList<Airport> airports = new ArrayList<Airport>();
        Airport KBP = new Airport();
        Airport IEV = new Airport();
        IEV.setCode("IEV");
        Flight f1 = new Flight();
        f1.setDepartureTime("10:00");
        f1.setArrivalTime("12:00");
        f1.setDate("08/12/2019");
        f1.setArrivalDate("08/12/2019");
        Flight f2 = new Flight();
        f2.setFlightCode("and second");
        f2.setDepartureTime("14:00");
        f2.setArrivalTime("17:00");
        f2.setDate("08/12/2019");
        f2.setArrivalDate("08/12/2019");
        KBP.setCityName("Kiev");
        KBP.setCode("KBP");
        airports.add(KBP);
        Airport SSH = new Airport();
        SSH.setCode("SSH");
        f2.setAirportTo(SSH);
        f2.setAirportFrom(KBP);
        addAirportToCity(kiev, airports, "KBP");
        f1.setAirportFrom(IEV);
        f1.setAirportTo(KBP);
        f1.setFlightCode("should be first");
        IEV.addDeparture(f1);
        KBP.addArrival(f1);
        KBP.addDeparture(f2);
        SSH.addArrival(f2);
        findFligthSequence(IEV, SSH, 3, "08/12/2019");

//        System.out.println(arr);
    }
}