package com.relewise.client.infrastructure;


/**
 * This is an exception that can be thrown from a RelewiseClient in cases where specific HTTP status codes or response
 * headers are present in the API responses.
 */
public class ClientException extends Exception {
    private final int code;

    public ClientException(String message, int code) {
        super(message);
        this.code = code;
    }

    public @Override String toString() {
        return super.toString() + " (" + code + ")";
    }
}
