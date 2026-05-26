/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.travelmanagementsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mohab Ibrahim
 */
import java.util.ArrayList;

public class Booking {

    private Hotel hotel;
    private ArrayList<Activity> activities;

    public Booking(Hotel hotel, ArrayList<Activity> activities) {
        this.hotel = hotel;
        this.activities = activities;
    }

    public double calculateTotal() {
        double total = hotel.getPrice();

        for (Activity a : activities) {
            total += a.getPrice();
        }
        return total;
    }
}
