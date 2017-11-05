package com.TPFinalGroupAssign.TheatreSystem.Factories;

import TheatreSystem.Domain.Admin;

import java.util.Map;

public class AdminFactory {

    public static Admin getAdmin(Map<String, Object> values){
        Admin adminFact = new Admin.Builder()
                .admin_id((Long)values.get("id"))
                .name((String) values.get("name"))
                .surname((String) values.get("surname"))
                .build();
        return adminFact;
    }
}
