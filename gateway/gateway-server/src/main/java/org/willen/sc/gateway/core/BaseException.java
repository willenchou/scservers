package org.willen.sc.gateway.core;

import lombok.Getter;

@Getter
public class BaseException extends RuntimeException {
    /**
     * 异常对应的错误类型
     */
    private ErrorType errorType;

    /**
     * 默认是系统异常
     */
    public BaseException() {
        this.setErrorType(ErrorType.SYSTEM_ERROR);
    }

    public BaseException(ErrorType errorType) {
        this.setErrorType(errorType);
    }

    public BaseException(ErrorType errorType, String message) {
        super(message);
        this.setErrorType(errorType);
    }

    public BaseException(ErrorType errorType, String message, Throwable cause) {
        super(message, cause);
        this.setErrorType(errorType);
    }

	public ErrorType getErrorType() {
		return errorType;
	}

	public void setErrorType(ErrorType errorType) {
		this.errorType = errorType;
	}
}
