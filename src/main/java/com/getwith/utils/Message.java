package com.getwith.utils;

public enum Message {

    ORDER("You have ordered a "),
    NO_SUGAR(" with 0 sugars (stick included)"),
    EXTRA_HOT(" extra hot"),
    NUll("");

    private String detail;

    Message(String detail) {
        this.detail = detail;
    }

    public String getDetail() {
        return this.detail;
    }

    public boolean isNull() {
        return this == Message.NUll;
    }

}
