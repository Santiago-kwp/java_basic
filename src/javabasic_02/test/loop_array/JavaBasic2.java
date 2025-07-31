package javabasic_02.test.loop_array;

public class JavaBasic2 {
    public static void main(String[] args) {

        int total3 = 0;
        for (int i = 3; i <= 100; i+=3) {
            total3 += i;
        }
        System.out.println(total3);
    }
}
