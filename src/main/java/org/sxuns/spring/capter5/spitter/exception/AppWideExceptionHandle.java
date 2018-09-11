package org.sxuns.spring.capter5.spitter.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class AppWideExceptionHandle {
    /**
     * 重复保存对象异常处理
     */
    @ExceptionHandler(DuplicateSpittleException.class)
    public String handleDuplicateSpittle(){
        return "error/duplicateSpittle";
    }
}
