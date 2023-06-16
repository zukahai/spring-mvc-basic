package com.base.main.exceptions;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class GlobalExceptionHandler {
    @ExceptionHandler({Exception.class})
    public @ResponseBody ResponseEntity<String> exception(Exception e) {
        e.printStackTrace();
        return ResponseEntity.internalServerError()
                .body("Internal Server Error");
    }
}
