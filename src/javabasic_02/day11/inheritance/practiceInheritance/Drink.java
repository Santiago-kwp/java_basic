package javabasic_02.day11.inheritance.practiceInheritance;

public class Drink {
    protected String name;
    protected int price;
    protected int count;

    public Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getTotalPrice() {
        return this.price * this.count;
    }

    public static void printTitle() {
        System.out.printf("%-8s\t%-8s\t%-5s\t%-8s\n", "상품명", "단가", "수량", "금액");
    }

    public void printData() {
        System.out.printf("%-8s\t%-8d\t%-5d\t%-8d\n", this.name, this.price, this.count, this.getTotalPrice());
    }
}
