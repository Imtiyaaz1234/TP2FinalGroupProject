package com.TPFinalGroupAssign.TheatreSystem.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Seating {
    @GeneratedValue
    @Id
    private long seating_id;
    private int bookings;
    private int avail;

    public long getSeating_id() {
        return seating_id;
    }

    public int getBookings() {
        return bookings;
    }

    public int getAvail() {
        return avail;
    }

    public ArrayList<Integer> getSeatNumber() {
        return seatNumber;
    }

    public String getLine() {
        return line;
    }

    public double getPrice() {
        return price;
    }

    private ArrayList<Integer> seatNumber;
    private String line;
    private double price;

    public Seats(){

    }

    public Seats(Builder builder){
        this.seating_id = builder.seating_id;
        this.seatNumber = builder.seatNu;
        this.line = builder.ln;
        this.price = builder.prc;
        this.bookings = builder.bookings;
        this.avail = builder.avail;
    }

    public static class Builder{
        private long id;
        private String seatNu, ln;
        private double prc;
        private int bookings;
        private int avail;

        public Builder id(long id){
            this.id = id;
            return this;
        }

        public Builder seatNumber(String nm){
            this.seatNu = nm;
            return this;
        }

        public Builder line(String l){
            this.ln = l;
            return this;
        }

        public Builder price(double pr){
            this.prc = pr;
            return this;
        }

        public Builder bookings(int bookings)
        {
            this.bookings = bookings;
            return this;
        }

        public Builder avail(int avail)
        {
            this.avail = avail;
            return this;
        }

        public Seats build(){ return new Seats(this);}
    }
}