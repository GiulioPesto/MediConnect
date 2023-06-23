package com.example.TeamProject.enums;

public enum AccountActivationStateEnum {
    ACTIVE("ACTIVE", "A"),
    NOT_ACTIVE("NOT_ACTIVE", "B");

    private String description;
    private String value;

    AccountActivationStateEnum(String description, String value) {
        this.description = description;
        this.value = value;
    }
}
