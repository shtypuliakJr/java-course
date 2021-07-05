package edu.lesson4.RegistrationProg.notes;

public class Address {

    private String index;
    private String city;
    private String street;
    private String homeNumber;
    private String apartmentNumber;

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