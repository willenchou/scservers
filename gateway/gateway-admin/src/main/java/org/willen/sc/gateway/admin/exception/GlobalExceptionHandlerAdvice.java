package org.willen.sc.gateway.admin.exception;


import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.willen.sc.common.core.entity.vo.Result;
import org.willen.sc.common.web.exception.DefaultGlobalExceptionHandlerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandlerAdvice extends DefaultGlobalExceptionHandlerAdvice {

    @ExceptionHandler(value = {DuplicateKeyException.class})
    public Result duplicateKeyException(DuplicateKeyException ex) {
        log.error("duplicate key:{}", ex.getMessage());
        return Result.fail("主键冲突");
    }
}