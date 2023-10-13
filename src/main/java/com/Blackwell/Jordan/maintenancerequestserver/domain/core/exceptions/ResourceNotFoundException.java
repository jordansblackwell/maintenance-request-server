package com.Blackwell.Jordan.maintenancerequestserver.domain.core.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message){
        super (message);
    }
}
