package javabasic_02.day11.inheritance.practiceInheritance;

public class printTest {
    public static void main(String[] args) {
        String header = String.format("%-12s %-12s %-12s %-12s", "item", "price", "count", "totalPrice");
        String row1 = String.format("%-12s %-12d %-12d %-12d", "coffee", 1500, 4, 6000);
        String row2 = String.format("%-12s %-12d %-12d %-12d", "americano", 2500, 3, 7500);

        System.out.println(header);
        System.out.println(row1);
        System.out.println(row2);
    }
}
