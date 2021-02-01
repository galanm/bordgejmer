package com.bordgejmer

import com.bordgejmer.user.User
import com.bordgejmer.user.UserOperations
import com.bordgejmer.user.UserRepository
import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT

@AutoConfigureMockMvc
@SpringBootTest(classes = BordGejMerApplication, webEnvironment = RANDOM_PORT)
class ContractsBase extends Specification {

    @Autowired
    private MockMvc mockMvc

    @Autowired
    private UserRepository userRepository

    @Autowired
    private MongoOperations mongoOperations

    def setup() {
        RestAssuredMockMvc.mockMvc(mockMvc)
        cleanDatabase()
        userRepository.saveAll([
                new User(name: 'user1'),
                new User(name: 'user2')
        ])
    }

    private void cleanDatabase() {
        userRepository.deleteAll()
        mongoOperations.indexOps(User).dropAllIndexes()
    }

}
