package com.example.gametime.firebase;

public enum FirebaseDBPaths {
    VENUES("Venues"),
    EVENTS("Events"),
    USERS("Users"),
    ADMINS("Admins"),
    CUSTOMERS("Customers");

    private final String path;

    private FirebaseDBPaths(String path){
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}