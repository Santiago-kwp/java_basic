package java_advanced_01.bookMarket;

import java.util.ArrayList;
import java.util.List;

public class Cart implements CartInterface {

    List<CartItem> mCartItem = new ArrayList<>();
    static int mCartCount = 0;

    public Cart() {

    }
    @Override
    public void printBookList(Book[] booklist) {
        for (int i=0; i < booklist.length; i++) {
            System.out.print(booklist[i].getBookId() + " | ");
            System.out.print(booklist[i].getName() + " | ");
            System.out.print(booklist[i].getUnitPrice() + " | ");
            System.out.print(booklist[i].getAuthor() + " | ");
            System.out.print(booklist[i].getDescription() + " | ");
            System.out.print(booklist[i].getCategory() + " | ");
            System.out.print(booklist[i].getReleaseDate() + " | ");
            System.out.println("");
        }
    }

    @Override
    public boolean isCartInBook(String bookId) {
        boolean flag = false;
        for (int i=0; i < mCartCount; i++) {
            if (bookId == mCartItem.get(i).getBookID()) {
                mCartItem.get(i).setQuantity(mCartItem.get(i).getQuantity() + 1);
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public void insertBook(Book book) {
        mCartItem.add(new CartItem(book));
    }

    @Override
    public void removeCart(int numId) {
        mCartItem.remove(numId);
        mCartCount = mCartItem.size();
    }

    public void diminishCart(int numId) {
        if (mCartItem.get(numId).getQuantity() ==1) {
            removeCart(numId);
        }
        else {
            mCartItem.get(numId).setQuantity(mCartItem.get(numId).getQuantity() - 1);
        }
    }

    @Override
    public void deleteBook() { // 장바구니 비우기
        mCartItem = new ArrayList<>();
        mCartCount = 0;
    }

    public void printCart() {
        System.out.println("장바구니 상품 목록 :");
        System.out.println("---------------------------------------");
        System.out.println("   도서ID \t|     수량\t|      합계");

        for (int i=0; i < mCartCount; i++) {
            System.out.print("    " + mCartItem.get(i).getBookID() + " \t| ");
            System.out.print("    " + mCartItem.get(i).getQuantity() + " \t| ");
            System.out.print("    " + mCartItem.get(i).getTotalPrice() + " \t| ");
            System.out.println(" ");
        }
        System.out.println("---------------------------------------");
    }
}
