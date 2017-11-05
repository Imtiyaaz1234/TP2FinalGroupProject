package com.TPFinalGroupAssign.TheatreSystem.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {
    @Id
    @GeneratedValue
    private long id
    private String name;
    private String surname;
    private Boolean viewRights = true;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Boolean getViewRights() {
        return viewRights;
    }

    public Admin(){

    }

    public Admin(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.viewRights = builder.isAuth;
    }

    public static class Builder{
        private String id, name;
        private Boolean isAuth;

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder name(String nm){
            this.name = nm;
            return this;
        }

        public Builder isAuth(Boolean isAu){
            this.isAuth = isAu;
            return this;
        }

        public Admin build(){ return new Admin(this);}
    }

}
