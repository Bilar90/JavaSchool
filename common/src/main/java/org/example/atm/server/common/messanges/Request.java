package org.example.atm.server.common.messanges;

import lombok.Getter;
import lombok.Value;

@Value
@Getter
public class Request {
    private final String id;
    private final int accountId;
    private final String hashPIN;
}