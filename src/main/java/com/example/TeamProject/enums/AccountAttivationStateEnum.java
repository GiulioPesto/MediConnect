package com.example.TeamProject.enums;

public enum AccountAttivationStateEnum {
    ATTIVO("ATTIVO"),
    NON_ATTIVO("NON_ATTIVO");

    private String description;

    AccountAttivationStateEnum(String description) {
        this.description = description;
    }
}
