package com.bordgejmer

import com.bordgejmer.user.User
import com.bordgejmer.user.UserRespository
import io.restassured.module.mockmvc.RestAssuredMockMvc
import lombok.Getter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT

@AutoConfigureMockMvc
@SpringBootTest(classes = BordGejMerApplication, webEnvironment = RANDOM_PORT)
class ContractsBase extends Specification {

    @Autowired
    private MockMvc mockMvc

    @Autowired
    private UserRespository userRepository

    void setup() {
        RestAssuredMockMvc.mockMvc(mockMvc)
        userRepository.saveAll([
                new User(name: 'user1'),
                new User(name: 'user2')
        ])

    }

    @Getter
    protected String userId
}
