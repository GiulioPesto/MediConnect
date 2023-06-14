package com.example.TeamProject.enums;

public enum AccountAttivationStateEnum {
    ACTIVE("ACTIVE", "A"),
    NO_ACTIVE("NO_ACTIVE", "B");

    private String description;
    private String value;

    AccountAttivationStateEnum(String description, String value) {
        this.description = description;
        this.value = value;
    }
}
