package com.bordgejmer

import io.restassured.module.mockmvc.RestAssuredMockMvc
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


    void setup() {
        RestAssuredMockMvc.mockMvc(mockMvc)
    }
}
