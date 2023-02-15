package com.relewise.client.infrastructure;

public class BadRequestException extends ClientException {
    public BadRequestException(String message, int code) { super(message, code); }
}
