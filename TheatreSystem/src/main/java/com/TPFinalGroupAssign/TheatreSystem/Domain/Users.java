package com.TPFinalGroupAssign.TheatreSystem.Domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.jws.Oneway;
import java.io.Serializable;
import java.util.Date;


@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue
    private String userID;
    private String name;
    private String surname;
    private String email;
    private Role role;
    private Boolean isAuthenticated;

    public User(){

    }

    public User(Builder builder){
        this.userID = builder.id;
        this.name = builder.name;
        this.surname = builder.sname;
        this.email = builder.mail;
        this.isAuthenticated = builder.isAuth;
    }

    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public Role getRole() {
        return role;
    }

    public Boolean getAuthenticated() {
        return isAuthenticated;
    }

    public static class Builder{
        private String id, name, sname,mail;
        private Boolean isAuth;

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder username(String nm){
            this.name = nm;
            return this;
        }

        public Builder surname(String snm){
            this.sname = snm;
            return this;
        }

        public Builder email(String em){
            this.mail = em;
            return this;
        }

        public Builder boolen() {
            return boolen();
        }

        public Builder boolen(Boolean bl){
            this.isAuth = bl;
            return this;
        }

        public User build(){ return new User(this);}
    }
}
