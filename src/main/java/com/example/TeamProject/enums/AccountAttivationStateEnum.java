package com.example.TeamProject.enums;

public enum AccountAttivationStateEnum {
    ACTIVE("ACTIVE"),
    NO_ACTIVE("NO_ACTIVE");

    private String description;

    AccountAttivationStateEnum(String description) {
        this.description = description;
    }
}
