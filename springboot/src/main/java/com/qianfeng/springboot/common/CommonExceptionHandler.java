package com.qianfeng.springboot.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author qiujinyao
 * @version 1.0
 * @Date 2019/7/30
 */
@ControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler(Exception.class)
    public  String handleException(Exception ex){
        System.out.println(ex);
        return  "Error";
    }
}
