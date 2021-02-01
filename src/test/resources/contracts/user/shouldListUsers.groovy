package user

import org.springframework.cloud.contract.spec.Contract

import static org.springframework.cloud.contract.verifier.util.ContentType.JSON

Contract.make {
    request {
        method 'GET'
        url '/user'
    }
    response {
        status OK()
        body([
                [
                        id: anyNonBlankString(),
                        name: 'user1'
                ],
                [
                        id: anyNonBlankString(),
                        name: 'user2'
                ],
        ])
        headers {
            contentType JSON.mimeType
        }
    }
}
