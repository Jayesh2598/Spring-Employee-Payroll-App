package com.cg.employeepayrollapp.exceptions;

import java.util.List;
import java.util.stream.Collectors;

import com.cg.employeepayrollapp.dto.ResponseDTO;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeePayrollExceptionHandler {
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDTO> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        List<ObjectError> errorList = exception.getBindingResult().getAllErrors();
        List<String> errorMsg = errorList.stream().map(objError -> objError.getDefaultMessage()).collect(Collectors.toList());
        ResponseDTO dto = new ResponseDTO("Exception occured while handling REST request", errorMsg);
        return new ResponseEntity<ResponseDTO>(dto, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(EmployeePayrollException.class)
    public ResponseEntity<ResponseDTO> handleEmployeePayrollException(EmployeePayrollException exception) {
        ResponseDTO dto = new ResponseDTO("Exception occured while handling REST request", exception.getMessage());
        return new ResponseEntity<ResponseDTO>(dto, HttpStatus.BAD_REQUEST);
    }
}
