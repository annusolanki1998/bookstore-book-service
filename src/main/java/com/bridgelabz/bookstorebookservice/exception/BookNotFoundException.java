package com.bridgelabz.bookstorebookservice.exception;

import com.bridgelabz.bookstorebookservice.util.Response;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class BookNotFoundException extends RuntimeException {
    public Response getErrorResponse;
    private int statusCode;
    private String statusMessage;

    public BookNotFoundException(int statusCode, String statusMessage) {
        super(statusMessage);
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

}
