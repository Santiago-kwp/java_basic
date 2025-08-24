package java_advanced_01.bookMarketV2.common;

import java_advanced_01.bookMarketV2.exception.MarketException;


public class ValidCheck {
    private static final String MENU_NUMBER = "^[1-9]$";
    private static final String CHECK_YES_OR_NO = "[YyNn]";


    //메인 메뉴 1-9번 유효 검사
    public void isMenuValid(String menu) {
        if(!(menu.matches(MENU_NUMBER))) {
            throw new MarketException(ErrorCode.INVALID_MENU_OPTION);
        }
    }

    // Yes or No 유효 검사
    public void isCheckYesOrNoValid(String menu) {
        if(!(menu.matches(CHECK_YES_OR_NO))) {
            throw new MarketException(ErrorCode.INVALID_YES_OR_NO_OPTION);
        }
    }



}
