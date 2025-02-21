package main.java.com.semicolon.africa.model;

public class Address {
    public String cityName;
    public String countryName;
    public String houseNumber;
    public String street;
    public String state;


    public Address(String cityName, String countryName, String houseNumber, String street, String state) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.houseNumber = houseNumber;
        this.street = street;
        this.state = state;
    }
}
