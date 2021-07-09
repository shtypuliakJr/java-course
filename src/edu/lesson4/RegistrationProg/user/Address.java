package edu.lesson4.RegistrationProg.user;


/**
 * @author Arthur Shtypuliak
 * @version 1.1
 * @since 1.0
 * Address is used as container for all location info.
 * @see User
 */
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