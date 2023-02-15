package com.relewise.client.infrastructure;

public class InternalServerErrorException extends ClientException {
    public InternalServerErrorException(String message, int code) { super(message, code); }
}
