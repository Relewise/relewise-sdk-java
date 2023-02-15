package com.relewise.client.infrastructure;

public class UnauthorizedException extends ClientException {
    public UnauthorizedException(String message, int code) { super(message, code); }
}
