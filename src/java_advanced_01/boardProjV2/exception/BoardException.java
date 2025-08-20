package java_advanced_01.boardProjV2.exception;

import java_advanced_01.boardProjV2.common.ErrorCode;

/*
    사용자 정의 Board 예외
 */
public class BoardException extends RuntimeException{
    private final ErrorCode error;

    public BoardException(ErrorCode error) {
        super(error.getMsg());
        this.error = error;
    }
}
