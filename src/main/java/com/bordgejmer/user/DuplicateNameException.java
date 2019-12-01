package com.bordgejmer.user;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.CONFLICT;

@ResponseStatus(CONFLICT)
class DuplicateNameException extends RuntimeException {
}
