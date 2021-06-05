package org.example.atm.server.processing.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Accounts")
@NoArgsConstructor
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue
    private Long Id;

    private int balance;

    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client clientId;
}
