package org.example.atm.server.processing.repository;

import org.example.atm.server.processing.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientCrudRepository extends CrudRepository<Client, Long> {
}
