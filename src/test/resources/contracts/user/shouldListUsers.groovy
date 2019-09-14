package user

import org.springframework.cloud.contract.spec.Contract

import static org.springframework.cloud.contract.spec.internal.HttpMethods.HttpMethod.GET
import static org.springframework.cloud.contract.verifier.util.ContentType.JSON

Contract.make {
    request {
        method GET
        url '/user'
    }
    response {
        status OK()
        body([
                [
                        name: 'user1'
                ],
                [
                        name: 'user2'
                ],
        ])
        headers {
            contentType JSON.mimeType
        }
    }
}
