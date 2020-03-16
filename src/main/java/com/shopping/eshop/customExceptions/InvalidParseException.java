package com.shopping.eshop.customExceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class InvalidParseException extends Exception {

    public InvalidParseException(String exception) {
        super(exception);
    }
}
