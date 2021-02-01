package com.bordgejmer.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

interface UserRepository extends CrudRepository<User, String> {
    @NonNull
    List<User> findAll();

    @NonNull
    Optional<User> findByName(String name);
}
