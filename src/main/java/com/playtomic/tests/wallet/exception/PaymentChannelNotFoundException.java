package com.playtomic.tests.wallet.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PaymentChannelNotFoundException extends RuntimeException {
    public PaymentChannelNotFoundException(final String message) { super(message);}

}
