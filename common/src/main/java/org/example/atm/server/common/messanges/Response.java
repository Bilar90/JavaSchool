package org.example.atm.server.common.messanges;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Response {
    private int balance;
    private String firstName;
    private String middleName;
    private String lastName;
}