package org.example.atm.server.processing.controller;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.example.atm.server.common.messanges.Request;
import org.example.atm.server.common.messanges.Response;
import org.example.atm.server.processing.AccountDTO;
import org.example.atm.server.processing.ClientDTO;
import org.example.atm.server.processing.exception.AccountNotFoundException;
import org.example.atm.server.processing.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Log
public class HostRestController {

    private ClientService clientService;

    @GetMapping("/healthCheck")
    public String getHostsInfo() {
        return "{data: \"I'am alive!\"}";
    }

    @GetMapping("/clients")
    public List<ClientDTO> getClientsInfo() {
        return clientService.getAllClients();
    }

    @PostMapping("/clients/{clientId}")
    public Response getBalance(@PathVariable("clientId") Long clientId,
                               @RequestBody Request request) {

        ClientDTO client = clientService.getClient(clientId, request.getHashPIN());

        List<AccountDTO> accounts = client.getAccountDTO();
        log.info(request.toString());
        try {
            Response response = new Response(accounts.get(request.getAccountId()).getBalance(),
                    client.getFirstName(),
                    client.getMiddleName(),
                    client.getLastName());

            log.info(response.toString());
            return response;
        }
        catch (IndexOutOfBoundsException e) {
            throw new AccountNotFoundException();
        }
    }
}
