package com.base.main.exceptions;

public class ForbiddenException extends RuntimeException{

            private static final long serialVersionUID = 1L;

            public ForbiddenException(String message) {
                super(message);
            }

            public ForbiddenException(String message, Throwable cause) {
                super(message, cause);
            }

            public ForbiddenException(){

            }
}
