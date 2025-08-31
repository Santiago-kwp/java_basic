package java_advanced_01.bookMarketV2;


import java_advanced_01.bookMarketV2.common.MarketText;
import java_advanced_01.bookMarketV2.common.ValidCheck;
import java_advanced_01.bookMarketV2.exception.MarketException;

import java.util.Map;
import java.util.Scanner;

public class MarketController {
    private static ValidCheck validCheck = new ValidCheck();
    static Scanner input = new Scanner(System.in);

    User user;
    BookDB bookDB = new BookDB();


    // 데이터를 CRUD 로직으로 다루기 위해서는 사용자가 필요하다 => 생성자 인젝션으로 구현
    public MarketController(User user) {
        this.user = user;
    }


    /*
    전체 마켓 로직 제어 메소드
    */
    public void run() {

        while (true) {
            mainMenu(); // 메인 메뉴 선택 문구 출력
            String menuNum = input.nextLine();
            try {
                validCheck.isMenuValid(menuNum);
                switch (menuNum) {
                    case "1" -> showUserInfo(user);
                    case "2" -> user.getCart().printItems();
                    case "3" -> user.getCart().deleteItem();
                    case "4" -> addUserItem(user);
                    case "5" -> diminishUserItemCount(user);
                    case "6" -> removeItem(user);
                    case "7" -> receiptUser(user);
                    case "8" -> {
                        exit();
                        return;
                    }
                    case "9" -> {}
                }
            } catch (MarketException e) {
                System.out.println(e.getMessage());
                run();
            }
        }
    }

    private void receiptUser(User user) {
        
    }

    private void removeItem(User user) {
        
    }





    /*
       main Menu 출력
    */


    public void mainMenu() {
        System.out.println(MarketText.STAR_LINE.getText());
        System.out.println(MarketText.HEADER.getText());
        System.out.println(MarketText.STAR_LINE.getText());
        System.out.println(MarketText.MAIN_MENU.getText());
        System.out.println(MarketText.STAR_LINE.getText());
        System.out.print(MarketText.MENU_SELECT.getText());
    }

    /*
    현재 고객 정보 확인
     */

    public void showUserInfo(User currentUser) {
        System.out.println("고객 명 : " + currentUser.getName());
        System.out.println("고객 ID : " + currentUser.getId());
        System.out.println("고객 연락처 : " + currentUser.getPhone());
    }

    /*
     고객의 장바구니 추가
     */
    public void addUserItem(User currentUser) {
        Book userBook = null;
        bookDB.showAllBooks();


        Boolean flag = false;
        while(!flag) {
            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 : ");
            String id = input.nextLine();
            userBook = bookDB.getBook(id);
            if (userBook == null) {
                System.out.println("다시 도서의 ID를 입력해주세요.");
            }
            else{
                flag = true;
            }
        }


        System.out.print("장바구니에 추가하시겠습니까? ");
        System.out.println(MarketText.YES_OR_NO_SELECT.getText());
        String userInput = input.nextLine();
        try {
            validCheck.isCheckYesOrNoValid(userInput);
            switch (userInput.toLowerCase()) {
                case "y" -> {
                    currentUser.getCart().insertItem(userBook);
                    System.out.println(userBook.getId()+ " 도서가 장바구니에 추가되었습니다.");
                }
            }
        }
        catch (MarketException e) {
                System.out.println(e.getMessage());
                run();
        }
    }

    /*
유저의 장바구니 항목 수량 줄이기
 */
    private void diminishUserItemCount(User user) {
        user.getCart().printItems();
        System.out.print("수량을 줄이고 싶은 상품의 id를 입력하세요 : ");
        String id = input.nextLine();
        Book book = bookDB.getBook(id);
        user.getCart().diminshItem(book);

    }

    public void exit() {
        System.exit(0);
    }


}
