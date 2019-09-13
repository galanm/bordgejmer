package contracts

import org.springframework.cloud.contract.spec.Contract
import org.springframework.cloud.contract.spec.internal.HttpMethods

import static org.springframework.cloud.contract.verifier.util.ContentType.JSON

def someUserName = 'some name'

Contract.make {
    request {
        method HttpMethods.HttpMethod.POST
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
                id: $(regex('^[a-fA-F\\d]{24}$')),
                name: someUserName
        ])
        headers {
            contentType JSON.mimeType
        }
    }
}
