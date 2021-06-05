package org.example.atm.server.processing;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Value;
import org.example.atm.server.processing.AccountDTO;

import javax.annotation.Priority;
import java.util.List;

@Value
@JsonPropertyOrder({"clientId","firstName","middleName","lastName","pin","accountDTO"})
public class ClientDTO {

    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final int clientId;

    private final String PIN;

    private final List<AccountDTO> accountDTO;

}
