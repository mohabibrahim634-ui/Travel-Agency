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




public class Admin extends User {

    public Admin(String email, String password) {
        super(email, password, "ADMIN"); // ✅ FIXED
    }

    public void addLocation(ArrayList<Location> locations, String name) {
        locations.add(new Location(name));
        System.out.println("Location added successfully");
    }

    public void addHotel(ArrayList<Hotel> hotels, String name, double price) {
        hotels.add(new Hotel(name, price));
        System.out.println("Hotel added successfully");
    }
}
