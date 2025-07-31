package javabasic_02.test.loop_array;

public class javaBasic3 {
    public static int dice() {
        return (int) (Math.random() * 6 + 1);
    }

    public static void main(String[] args) {
        int num1, num2;
        while (true) {
            num1 = dice();
            num2 = dice();
            System.out.printf("(%d, %d)\n", num1, num2);
            if (num1 + num2 != 5) continue;
            else break;
        }
    }
}
