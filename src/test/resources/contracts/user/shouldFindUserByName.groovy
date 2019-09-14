package user

import org.springframework.cloud.contract.spec.Contract

import static org.springframework.cloud.contract.spec.internal.HttpMethods.HttpMethod.GET
import static org.springframework.cloud.contract.verifier.util.ContentType.JSON

Contract.make {
    request {
        method GET
        url '/user/user1'
    }
    response {
        status OK()
        body([
                name: 'user1'
        ])
        headers {
            contentType JSON.mimeType
        }
    }
}
