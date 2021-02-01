package com.bordgejmer.user

import spock.lang.Specification
import spock.lang.Subject

class UserOperationsSpec extends Specification {

    UserRepository userRepository = Mock()

    @Subject
    UserOperations userOperations = new UserOperations(userRepository)

    def 'should throw exception when creating user with existing name'() {
        given:
            userRepository.findByName(_) >> Optional.of(new User())

        when:
            userOperations.create(new User('user1'))

        then:
            thrown DuplicateNameException
    }

    def 'should create user with unique name'() {
        given:
            userRepository.findByName(_) >> Optional.empty()
            def createdUser = new User('user1')

        when:
            userOperations.create(createdUser)

        then:
            1 * userRepository.save(createdUser)
    }
}
