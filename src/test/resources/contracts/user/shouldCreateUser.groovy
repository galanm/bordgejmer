package user

import org.springframework.cloud.contract.spec.Contract

import static org.springframework.cloud.contract.verifier.util.ContentType.JSON

def someUserName = 'some name'

Contract.make {
    request {
        method 'POST'
        url '/user'
        body([
                name: someUserName,
        ])
        headers {
            contentType JSON.mimeType
        }
    }
    response {
        status OK()
        body([
                id: anyNonBlankString(),
                name: someUserName
        ])
        headers {
            contentType JSON.mimeType
        }
    }
}
