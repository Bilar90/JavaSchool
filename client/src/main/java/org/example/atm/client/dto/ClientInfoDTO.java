package org.example.atm.client.dto;

import lombok.*;

import java.util.StringTokenizer;

public class ClientInfoDTO {
    private final int balance;
    private final String firstName;
    private final String middleName;
    private final String lastName;

    public ClientInfoDTO(int balance, String firstName, String middleName, String lastName) {
        this.balance = balance;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    };
}
