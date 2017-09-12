package com.example.demostudygroup.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HotelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String hotelName;
    private double pricePerNight;
    private int nbofNights;


    public HotelBooking(){

    }

    public HotelBooking(String hotelName,double pricePerNight,int nbofNights){
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nbofNights = nbofNights;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public int getNbofNights() {
        return nbofNights;
    }

    public String getHotelName() {
        return hotelName;
    }

    public double getTotalPrice(){
        return pricePerNight*nbofNights;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setNbofNights(int nbofNights) {
        this.nbofNights = nbofNights;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public long getId() {
        return id;
    }
}
