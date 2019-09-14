package com.bordgejmer.user;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRespository extends CrudRepository<User, String> {
    List<User> findAll();
    Optional<User> findByName(String name);
}
