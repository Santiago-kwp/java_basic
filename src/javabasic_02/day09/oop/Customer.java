package javabasic_02.day09.oop;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String phone;
    private ArrayList<Item> cart = new ArrayList<>();


    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // 1. 고객 정보 확인하기
    public void menuGuestInfo() {
        System.out.println("고객 명 : " + this.name);
        System.out.println("전화번호 : " + this.phone);
    }

    // 2. 장바구니 상품 목록 보기
    public void menuCartItemList() {
        for (Item item : cart)
            System.out.printf("상품 명 : %s, 상품 가격 : %d, 선택 수량 : %d\n",item.getItemName(),item.getPrice(), item.getNumber());
    }

    // 3. 장바구니 비우기
    public void menuCartClear() {
        // 카트 인스턴스 초기화
        cart = new ArrayList<>();
    }

    // 4. 바구니에 항목 추가하기
    public void menuCartAddItem(Item item) {
        // 장바구니에 아이템 추가
        cart.add(item);
    }

    // 5. 장바구니의 항목 수량 줄이기
    public void menuCartRemoveItemCount(String itemName) {
        // 하나씩 순회하면서 수량 줄이기
        boolean findItem = false;
        for (Item item : cart) {
            if (item.getItemName().equals(itemName)) {
                item.reduceNumber();
                findItem = true;
            }
        }
        // 일치하는 상품이 없다면 일단 알려주기만 하기...
        if (!findItem) System.out.println("일치하는 상품이 없습니다.");


    }

    // 6. 장바구니의 항목 삭제하기
    public void menuCartRemoveItem(String itemName) {
        // 하나씩 순회하면서 항목 삭제
        boolean findItem = false;

        for (Item item : cart) {
            if (item.getItemName().equals(itemName)) {
                cart.remove(item);
                findItem = true;
            }
        }
        // 일치하는 상품이 없다면 일단 알려주기만 하기...
        if (!findItem) System.out.println("일치하는 상품이 없습니다.");
    }

    // 7. 영수증 표시하기
    public void menuCartBill() {
        int totalBill = 0;
        for (Item item: cart) {
            totalBill += item.getPrice() * item.getNumber();
        }
        System.out.printf("선택하신 전체 상품의 금액(상품별 가격 * 수량)은 %d원입니다.\n", totalBill);

    }

    // 8. 종료하기
    public void menuExit()  {
        System.out.println("이용해주셔서 감사합니다.");
    }


}
