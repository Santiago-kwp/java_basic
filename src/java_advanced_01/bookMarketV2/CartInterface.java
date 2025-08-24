package java_advanced_01.bookMarketV2;

public interface CartInterface {

    // 전체 장바구니의 아이템 정보 목록을 출력하는 메소드
    void printItems();

    // 장바구니에 담긴 상품의 ID와 장바구니에 담을 상품의 ID를 비교하는 메소드
    boolean isCartInItem(String id);

    // 장바구니 항목 관리 클래스 CartItem에 상품 정보를 등록하는 메소드
    void insertItem(Item item);

    // 장바구니 순번 numId의 항목을 삭제하는 메소드
    void removeCart(Item item);

    // 장바구니의 모든 항목을 삭제하는 메소드
    void deleteItem();
}
