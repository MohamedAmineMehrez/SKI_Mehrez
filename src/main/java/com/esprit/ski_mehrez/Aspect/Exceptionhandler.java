package com.esprit.ski_mehrez.Aspect;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class Exceptionhandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public Map<String,String> HandlerException(Exception exception)
    {
        Map map = new HashMap<>();
        map.put("Error",exception.getMessage());
        return map;
    }

}
