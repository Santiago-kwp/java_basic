package java_advanced_01.bookMarketV2;

import lombok.Getter;

@Getter
public class User extends Person {
    private Cart cart;
    private String id;

    public User(String name, String phone, String id) {
        super(name, phone);
        this.id = id;
        this.cart = new Cart();
    }


}
