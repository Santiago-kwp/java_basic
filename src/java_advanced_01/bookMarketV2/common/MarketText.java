package java_advanced_01.bookMarketV2.common;

import lombok.Getter;

@Getter
public enum MarketText {
    HEADER("\t\t\tWelcome to Shopping Mall\n\t\t\tWelcome to Book Market!"),
    BORDER_LINE("-".repeat(60)),
    STAR_LINE("*".repeat(60)),
    MAIN_MENU("""
             1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기
             2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기
             3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기
             7. 영수증 표시하기 \t8. 종료
             9. 관리자 로그인
    """),
    MENU_SELECT("메뉴 번호를 선택해주세요 : "),
    YES_OR_NO_SELECT("Y/y | N/n"),

    READ_LINE("#".repeat(60));

    private final String text;

    MarketText(String text) {
        this.text = text;
    }

}
