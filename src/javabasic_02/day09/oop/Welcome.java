package javabasic_02.day09.oop;

import java.util.Scanner;

public class Welcome {
    static Scanner sc = new Scanner(System.in);
    static int choiceNum = 0;

    public static void main(String[] args) {

        // 손님 이름 및 전화번호 입력받기
        Customer customer = inputCustomerInfo();

        while(choiceNum !=8) {
            choiceNum = showMenu();
            selectMenu(customer, choiceNum);
        }


    }

    public static void selectMenu(Customer customer, int choiceNum) {
        switch (choiceNum) {
            case 1 -> customer.menuGuestInfo();
            case 2 -> customer.menuCartItemList();
            case 3 -> customer.menuCartClear();
            case 4 -> {
                String itemName;
                int itemPrice;
                int itemNumber;
                System.out.println("원하시는 상품의 이름을 입력하세요. ");
                itemName = sc.nextLine();
                System.out.println("원하시는 상품의 가격을 입력하세요. ");
                itemPrice = Integer.parseInt(sc.nextLine());
                System.out.println("원하시는 상품의 수량을 입력하세요. ");
                itemNumber = Integer.parseInt(sc.nextLine());
                customer.menuCartAddItem(new Item(itemName,itemPrice,itemNumber));
            }
            case 5 -> {
                customer.menuCartItemList();
                System.out.println("위의 상품 중에 선택 수량을 줄이고 싶은 상품의 상품 명을 입력하세요. ");
                String itemName = sc.nextLine();
                customer.menuCartRemoveItemCount(itemName);

            }
            case 6 -> {
                customer.menuCartItemList();
                System.out.println("위의 상품 중에 빼고 싶은 상품의 상품 명을 입력하세요. ");
                String itemName = sc.nextLine();
                customer.menuCartRemoveItem(itemName);
            }
            case 7 -> customer.menuCartBill();
            case 8 -> customer.menuExit();
        }
    }

    public static Customer inputCustomerInfo() {

        System.out.println("당신의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("연락처를 입력하세요 : ");
        String phone = sc.nextLine();

        // Customer 인스턴스 생성 및 반환
        return new Customer(name, phone);

    }

    public static int showMenu(){
        //메뉴판 문자열
        String divLine = "*******************************************************";
        String welcomeMent1 = "Welcome to Shopping Mall";
        String welcomeMent2 = "Welcome to Book Market";
        String menu1 = "1. 고객 정보 확인하기";
        String menu2 = "2. 장바구니 상품 목록 보기";
        String menu3 = "3. 장바구니 비우기";
        String menu4 = "4. 바구니에 항목 추가하기";
        String menu5 = "5. 장바구니의 항목수량 줄이기";
        String menu6 = "6. 장바구니의 항목 삭제하기";
        String menu7 = "7. 영수증 표시하기";
        String menu8 = "8. 종료";

        System.out.printf("%s\n", divLine);
        System.out.printf("\t\t\t%s\n", welcomeMent1);
        System.out.printf("\t\t\t%s\n", welcomeMent2);
        System.out.printf("%s\n", divLine);
        System.out.printf("%-20s\t%s \n", menu1, menu4);
        System.out.printf("%-20s\t%s \n", menu2, menu5);
        System.out.printf("%-20s\t%s \n", menu3, menu6);
        System.out.printf("%-20s\t%s \n", menu7, menu8);
        System.out.printf("%s\n", divLine);

        System.out.print("메뉴 번호를 선택해주세요 ");
        return Integer.parseInt(sc.nextLine());

    }
}
