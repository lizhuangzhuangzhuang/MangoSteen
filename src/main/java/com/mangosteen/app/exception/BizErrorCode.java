package com.mangosteen.app.exception;

public enum BizErrorCode {
    INVALID_PARAMETER("USER_INVALID_PARAMETER"),
    USER_NOT_FOUND("NOT_FOUND");

    private String message;
    BizErrorCode(String message){
        this.message = message;
    }
}
