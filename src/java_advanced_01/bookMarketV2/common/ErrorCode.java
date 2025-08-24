package java_advanced_01.bookMarketV2.common;

public enum ErrorCode {
    INVALID_MENU_OPTION("잘못된 메뉴 번호입니다. [1-9]번 다시 입력하세요"),
    INVALID_YES_OR_NO_OPTION("잘못된 알파벳입니다. [Y/y or N/n]을 입력하세요"),

    INVALID_CHECK_ID("장바구니 상품의 id를 입력하세요!"),

    INVALID_Cart_ID("해당 상품은 존재하지 않습니다."),

    INVALID_EMPTY("게시물 번호를 입력하세요.");

    private String msg;

    ErrorCode(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
