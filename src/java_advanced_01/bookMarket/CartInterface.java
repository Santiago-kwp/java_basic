package java_advanced_01.bookMarket;

public interface CartInterface {
    // 전체 도서 정보 목록을 출력하는 메소드
    void printBookList(Book[] p);

    // 장바구니에 담긴 도서의 ID와 장바구니에 담을 도서의 ID를 비교하는 메소드
    boolean isCartInBook(String id);

    // 장바구니 항목 관리 클래스 CartItem에 도서 정보를 등록하는 메소드
    void insertBook(Book p);

    // 장바구니 순번 numId의 항목을 삭제하는 메소드
    void removeCart(int numId);

    // 장바구니의 모든 항목을 삭제하는 메소드
    void deleteBook();


}
