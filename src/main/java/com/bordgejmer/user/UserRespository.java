package com.bordgejmer.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRespository extends CrudRepository<User, String> {
}
