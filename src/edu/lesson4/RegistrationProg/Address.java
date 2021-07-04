package edu.lesson4.RegistrationProg;

public class Address {

    private final String index;
    private final String city;
    private final String street;
    private final String homeNumber;
    private final String apartmentNumber;

    public Address(String index, String city, String street, String homeNumber, String apartmentNumber) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public String getIndex() {
        return index;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }
}