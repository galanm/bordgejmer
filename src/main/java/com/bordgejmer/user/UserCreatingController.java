package com.bordgejmer.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController("/user")
@RequiredArgsConstructor
public class UserCreatingController {

    private final UserRespository userRespository;

    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public User create(@RequestBody User user) {
        return userRespository.save(user);
    }


}
