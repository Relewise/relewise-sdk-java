package com.relewise.client.infrastructure;

public class ServiceUnavailableException extends ClientException {
    public ServiceUnavailableException(String message, int code) { super(message, code); }
}
