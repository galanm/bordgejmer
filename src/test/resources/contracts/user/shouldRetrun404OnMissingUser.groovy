package user

import org.springframework.cloud.contract.spec.Contract

import static org.springframework.cloud.contract.spec.internal.HttpMethods.HttpMethod.GET
import static org.springframework.cloud.contract.verifier.util.ContentType.JSON

Contract.make {
    request {
        method GET
        url '/user/userX'
    }
    response {
        status NOT_FOUND()
    }
}
