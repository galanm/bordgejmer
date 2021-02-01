package user

import org.springframework.cloud.contract.spec.Contract

import static org.springframework.cloud.contract.verifier.util.ContentType.JSON

def existingUserName = 'user1'

Contract.make {
    request {
        method 'POST'
        url '/user'
        body([
                name: existingUserName,
        ])
        headers {
            contentType JSON.mimeType
        }
    }
    response {
        status CONFLICT()
    }
}
