package org.example.atm.server.processing.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Clients")
@NoArgsConstructor
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String middleName;
    private String lastName;

    private String PIN;

    @OneToMany(mappedBy = "clientId")
    private Set<Account> account;
}
