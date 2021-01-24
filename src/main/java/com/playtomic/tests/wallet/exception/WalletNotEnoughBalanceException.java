package com.playtomic.tests.wallet.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class WalletNotEnoughBalanceException extends RuntimeException{
    public WalletNotEnoughBalanceException(final String message) { super(message);}

}
