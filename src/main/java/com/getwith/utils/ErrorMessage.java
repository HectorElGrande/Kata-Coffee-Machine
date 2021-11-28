package com.getwith.utils;

public enum ErrorMessage {

    DRINK_NAME_NOT_FOUND("The drink type should be tea, coffee or chocolate."),
    INCORRECT_PAID("The %s costs + %f."),
    INCORRECT_AMOUNT_SUGARS("The number of sugars should be between 0 and 2."),
    NUll("");

    private String detail;

    ErrorMessage(String detail) {
        this.detail = detail;
    }

    public String getDetail() {
        return this.detail;
    }

    public boolean isNull() {
        return this == ErrorMessage.NUll;
    }

}
