package com.bordgejmer.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
class UserListingEndpoint {
    private final UserRespository userRespository;

    @GetMapping
    List<User> getUsers() {
        return userRespository.findAll();
    }

    @GetMapping("/{name}")
    User getUser(@PathVariable String name) {
        return userRespository.findByName(name).orElseThrow(UserNotFoundException::new);
    }

}
