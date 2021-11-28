package com.getwith;

import com.getwith.utils.ErrorMessage;

public class ParserException extends RuntimeException {

    public ParserException(String detail) {
        super(detail);
    }

    public ParserException(ErrorMessage errorMessage, String drink, String money) {
        this(String.format(errorMessage.getDetail(), "\"" + drink + "\"" + money + "\""));
    }

    public ParserException(ErrorMessage errorMessage) {
        this(errorMessage.getDetail());
    }

}
