package java_advanced_01.bookMarketV2;

import java.util.Scanner;

public class MarketMain {

    public static void main(String[] args) {
        MarketController marketController = new MarketController(login());

        marketController.run();


    }

    /*
    로그인
    */
    public static User login() {
        Scanner input = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요 : ");
        String username = input.nextLine();
        System.out.println();

        System.out.print("당신의 id를 입력하세요 : ");
        String userid = input.nextLine();
        System.out.println();

        System.out.print("연락처를 입력하세요 : ");
        String phone = input.nextLine();
        System.out.println();

        return new User(userid, username, phone);
    }
}
