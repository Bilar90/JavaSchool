package org.example.atm.server.processing.service;

import lombok.AllArgsConstructor;
import org.example.atm.server.processing.entity.Account;
import org.example.atm.server.processing.entity.Client;
import org.example.atm.server.processing.exception.ClientNotFoundException;
import org.example.atm.server.processing.exception.PINIncorrectException;
import org.example.atm.server.processing.repository.ClientCrudRepository;
import org.springframework.stereotype.Service;
import org.example.atm.server.processing.AccountDTO;
import org.example.atm.server.processing.ClientDTO;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class ClientService {
    private ClientCrudRepository clientCrudRepository;

    public ClientDTO getClient(Long id, String hashPIN) {
        Client client = clientCrudRepository.findById(id)
                .orElseThrow(ClientNotFoundException::new);

        if (!client.getPIN().equals(hashPIN))
            throw new PINIncorrectException();

        Set<Account> accountSet = client.getAccount();
        List<AccountDTO> accountDTOSet = new ArrayList<>();

        for (Account account : accountSet) {

            accountDTOSet.add(new AccountDTO(account.getId().intValue(),
                    account.getBalance()));

        }

        return new ClientDTO(client.getFirstName(),
                client.getMiddleName(),
                client.getLastName(),
                client.getId().intValue(),
                client.getPIN(),
                accountDTOSet);
    }

    public List<ClientDTO> getAllClients() {
        Iterable<Client> clientIterable = clientCrudRepository.findAll();
        List<ClientDTO> clients = new ArrayList<>();

        clientIterable.forEach(
                client -> {
                    Set<Account> accountSet = client.getAccount();
                    List<AccountDTO> accountDTOSet = new ArrayList<>();

                    for (Account account : accountSet) {

                        accountDTOSet.add(new AccountDTO(account.getId().intValue(),
                                account.getBalance()));
                    }
                    clients.add(new ClientDTO(client.getFirstName(),client.getMiddleName(),client.getLastName(),client.getId().intValue(),client.getPIN(),accountDTOSet));
                }
        );
        return clients;
    }
}
