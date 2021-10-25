package com.company;

public class Pizza {
    Circle basic; // pizza shape
    String composition; // pizza composition
    String name; // pizza name
    double price; // pizza price
    double radius;
    Pizza(Circle bas, String com, String nam, double pr, double rad){
        basic=bas;
        composition=com;
        name=nam;
        price=pr;
        radius=rad;
    }
   }
