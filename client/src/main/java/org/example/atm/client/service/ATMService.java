package org.example.atm.client.service;

import org.example.atm.client.dto.ClientInfoDTO;
import org.springframework.stereotype.Service;

@Service
public class ATMService {
    public ClientInfoDTO getClientBalance(int balance, String firstName, String middleName, String lastName) {
        return new ClientInfoDTO(balance, firstName, middleName, lastName);
    }
}
