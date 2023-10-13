package com.ClusteredData.util;

import com.ClusteredData.Exceptions.ClusterdDataException;
import com.ClusteredData.model.DealError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerException {
    @ExceptionHandler
    public ResponseEntity<DealError> getExceptionNotFound(ClusterdDataException se){
        DealError  dealError = new DealError();
        dealError.setStatusCode(HttpStatus.NOT_FOUND.value());
        dealError.setMessage(se.getMessage());
        dealError.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<DealError>(dealError,HttpStatus.NOT_FOUND);
    }
}
