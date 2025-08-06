package javabasic_02.day11.inheritance.practiceInheritance;

public class Alcohol extends Drink{
    private double alcper;

    public Alcohol(String name, int price, int count, double alcper) {
        super(name, price, count);
        this.alcper = alcper;
    }

    public static void printTitle() {
        System.out.printf("%-15s\t%s\t\t%s\t\t%s\n", "상품명 (도수[%])", "단가", "수량", "금액");
    }
    @Override
    public void printData() {
    System.out.printf("%s (%.1f)\t\t\t%s\t%s\t\t%s\n", this.name, this.alcper, this.price, this.count, this.getTotalPrice());
    }

}
