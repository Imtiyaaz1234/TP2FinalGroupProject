package com.TPFinalGroupAssign.TheatreSystem.Factories;

public class UserFactory {

    public static Users getUser(Map<String, Object> values){
        Users userFact = new Users.Builder()
                .userId((Long)values.get("userId"))
                .name((String) values.get("name"))
                .surname((String) values.get("surname"))
                .email((String) values.get("email"))
                .build();
        return userFact;
    }
}