package com.grigor.picsart.exception;

public class EntityException extends RuntimeException {
    public EntityException(Exception e) {
        super(e.getMessage());
    }
}
