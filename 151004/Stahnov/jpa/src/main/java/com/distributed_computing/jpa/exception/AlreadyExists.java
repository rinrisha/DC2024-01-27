package com.distributed_computing.jpa.exception;

public class AlreadyExists extends RuntimeException{
    public AlreadyExists(String message) {
        super(message);
    }
}
