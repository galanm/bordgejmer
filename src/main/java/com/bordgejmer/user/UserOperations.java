package com.bordgejmer.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
class UserOperations {

    private final UserRepository userRepository;

    User create(User user) {
        if (isUnique(user.getName())) {
            return userRepository.save(user);
        } else {
            throw new DuplicateNameException();
        }
    }

    List<User> findAll() {
        return userRepository.findAll();
    }

    Optional<User> findByName(String name) {
        return userRepository.findByName(name);
    }

    private boolean isUnique(String name) {
        return findByName(name).isEmpty();
    }

}
