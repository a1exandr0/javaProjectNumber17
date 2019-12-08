package com.company;

public class Country {
    private String CountryName;
    private String LocalCurrency;
    private String Continent;
    private boolean VisaNeeded;

    public Country() {
        this.CountryName = null;
        this.LocalCurrency = null;
        this.Continent = null;
        this.VisaNeeded = false;
    }

    public String getCountryName() {
        return CountryName;
    }

    public String getContinent() {
        return Continent;
    }

    public String getLocalCurrency() {
        return LocalCurrency;
    }

    public boolean getVisaNeeded() {
        return VisaNeeded;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    public void setLocalCurrency(String localCurrency) {
        LocalCurrency = localCurrency;
    }

    public void setVisaNeeded(boolean visaNeeded) {
        VisaNeeded = visaNeeded;
    }
}
