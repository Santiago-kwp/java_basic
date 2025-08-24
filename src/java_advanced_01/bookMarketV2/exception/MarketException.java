package java_advanced_01.bookMarketV2.exception;

import java_advanced_01.bookMarketV2.common.ErrorCode;

/*
    사용자 정의 Board 예외
 */
public class MarketException extends RuntimeException{
    private final ErrorCode error;

    public MarketException(ErrorCode error) {
        super(error.getMsg());
        this.error = error;
    }
}
