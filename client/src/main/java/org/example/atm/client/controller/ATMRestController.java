package org.example.atm.client.controller;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.apache.commons.codec.digest.DigestUtils;
import org.example.atm.client.service.ATMService;
import org.example.atm.server.common.messanges.Request;
import org.example.atm.server.common.messanges.Response;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

@RestController
@AllArgsConstructor
@Log
public class ATMRestController {
    private ATMService atmService;

    @GetMapping("/healthCheck")
    public String getATMsStatus() {
        return "I'am alive!";
    }

    @GetMapping("/clients/{clientId}/accounts/{accountId}/{PIN}")
    public Response getClientBalance (
            @PathVariable("clientId") Long clientId,
            @PathVariable("accountId") int accountId,
            @PathVariable("PIN") int PIN) {

        String hashPIN = DigestUtils.sha256Hex(String.valueOf(PIN));
        String rqUID = java.util.UUID.randomUUID().toString();

        log.info("rqUID" + rqUID + "clientId " + clientId + " accountId " + accountId + " hashPIN " + hashPIN);

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Request> request = new HttpEntity<>(new Request(rqUID, accountId, hashPIN));

        log.info("request.toString()" + request.toString());

        try {
            Response response = restTemplate.postForObject(
                    "http://127.0.0.1:8080/clients/" + clientId, request, Response.class);

            return response;
        }
        catch (HttpClientErrorException | HttpServerErrorException e) {
            throw new ResponseStatusException(e.getStatusCode());
        }
    }
}
