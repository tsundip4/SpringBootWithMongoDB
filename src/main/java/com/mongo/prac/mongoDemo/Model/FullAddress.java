package com.mongo.prac.mongoDemo.Model;

public class FullAddress {
    private String streetAddress;
    private String city;
    private String zipCode;

    public FullAddress(String streetAddress, String city, String zipCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
