package com.mangosteen.app.exception;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends ServiceException {
    public ResourceNotFoundException(String message){
        super(message);
//        this.setStatrsCode(HttpStatus.NOT_FOUND.value());
        this.setErrorCode(BizErrorCode.USER_NOT_FOUND);
        this.setErrorType(ErrorType.Client);
    }
}
