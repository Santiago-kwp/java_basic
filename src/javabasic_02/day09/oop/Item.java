package javabasic_02.day09.oop;

public class Item {
    private String itemName;
    private int price;
    private int number;

    public Item(String itemName, int price, int number) {
        this.itemName = itemName;
        this.price = price;
        this.number = number;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }
    public void reduceNumber() {
        number--;
    }
}
