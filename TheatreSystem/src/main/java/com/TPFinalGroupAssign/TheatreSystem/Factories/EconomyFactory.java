package com.TPFinalGroupAssign.TheatreSystem.Factories;

import TheatreSystem.Domain.Economy;

public class EconomyFactory {

    public static Economy getEconomy(Map<String, Object> values){
        Economy economyFact = new economy.Builder()
                .seat_id((Long)values.get("seat_id"))
                .class_name((String)values.get("class_name"))
                .price((int) values.get("price"))
                .build();
        return reservationFact;
    }
}