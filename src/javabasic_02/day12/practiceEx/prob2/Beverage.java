package javabasic_02.day12.practiceEx.prob2;

public abstract class Beverage {
    private String name;
    protected int price;

    public abstract void calcPrice();
    public void print(){
        System.out.println("판매 음료는 "+this.name+"이며, 가격은 "+this.price);
    }
    public Beverage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
