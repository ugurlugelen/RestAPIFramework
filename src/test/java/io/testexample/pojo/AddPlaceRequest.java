package io.testexample.pojo;

import java.util.List;

public class AddPlaceRequest {

    private LocationAddPlaceRequest location;
    private int accuracy;
    private String name;
    private String phone_number;
    private String address;
    private List<String> types;
    private String website;
    private String language;

    public AddPlaceRequest() {
    }

    public AddPlaceRequest(LocationAddPlaceRequest location, int accuracy, String name, String phone_number, String address, List<String> types, String website, String language) {
        this.location = location;
        this.accuracy = accuracy;
        this.name = name;
        this.phone_number = phone_number;
        this.address = address;
        this.types = types;
        this.website = website;
        this.language = language;
    }

    public LocationAddPlaceRequest getLocation() {
        return location;
    }

    public void setLocation(LocationAddPlaceRequest location) {
        this.location = location;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}

