package java_advanced_01.bookMarketV2;


import java_advanced_01.bookMarketV2.common.MarketText;

import java.util.HashMap;

import java.util.Map;
import java.util.Optional;

public class Cart implements CartInterface{
    // Item 객체를 키로, 객체의 수량을 값으로 가지고 있는 나의 카트
    Map<Item, Integer> myCart = new HashMap<>();


    @Override
    public void printItems() {
        System.out.println(MarketText.BORDER_LINE.getText());

        if (myCart == null) {
            System.out.println("Cart is empty");
            return;
        }

        Optional.ofNullable(myCart).
                ifPresent(cart -> cart.entrySet().stream().
                        forEach( (entry) ->
                                System.out.printf("%s\t | %d\t | %s\n",
                                        entry.getKey().getId(), entry.getValue(), entry.getKey().getName())
                        )); //
        System.out.println(MarketText.BORDER_LINE.getText());
    }

    @Override
    public boolean isCartInItem(String id) {
        return Optional.ofNullable(myCart).map(cart -> cart.containsKey(id))
                .orElse(false);
    }

    @Override
    public void insertItem(Item item) {
        if(myCart.containsKey(item)) {
            myCart.put(item, myCart.get(item) + 1);
        } else {
            myCart.put(item, 1);
        }
    }

    @Override
    public void removeCart(Item item) {
        myCart.remove(item);

    }

    // 장바구니의 모든 항목 삭제
    @Override
    public void deleteItem() {
        myCart = new HashMap<>();

    }

    // 장바구니의 특정 항목 개수 하나 줄이기
    public void diminshItem(Item item){
        if (myCart.get(item) == 1) {
            myCart.remove(item);
        } else {
            myCart.replace(item, myCart.get(item) - 1);
        }
    }

    public void setMyCart(Map<Item, Integer> myCart) {
        this.myCart = myCart;
    }
}
