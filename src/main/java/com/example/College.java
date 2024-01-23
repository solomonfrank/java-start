package com.example;

import org.springframework.beans.factory.annotation.Value;

public class College {

    @Value("${myApp.firstName}")
    private String givenName;

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void displayName() {
        System.out.println("Heloo" + " " + givenName);
    }
}
