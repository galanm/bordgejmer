package user

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/user/userX'
    }
    response {
        status NOT_FOUND()
    }
}
