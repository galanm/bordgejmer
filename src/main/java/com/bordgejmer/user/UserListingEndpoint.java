package com.bordgejmer.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
class UserListingEndpoint {

    private final UserOperations userOperations;

    @GetMapping
    List<User> getUsers() {
        return userOperations.findAll();
    }

    @GetMapping(value = "/{name}", produces = APPLICATION_JSON_VALUE)
    User getByName(@PathVariable String name) {
        return userOperations.findByName(name).orElseThrow(UserNotFoundException::new);
    }

}
