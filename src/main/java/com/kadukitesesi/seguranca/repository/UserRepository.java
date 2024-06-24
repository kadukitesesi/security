package com.kadukitesesi.seguranca.repository;

import com.kadukitesesi.seguranca.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {

        Optional<User> findByUsername(String username);
}
