package com.bordgejmer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import spock.lang.Specification

@SpringBootTest
class BordGejMerApplicationSpec extends Specification {

    @Autowired
    ApplicationContext context

    def 'context loads'() {
        expect:
            context
    }

}
