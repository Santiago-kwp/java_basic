package javabasic_01.day02;

public class BooleanEx {
    public static void main(String[] args) {
        boolean stop = true;
        if (stop) {
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }

        int x = 30;
        boolean result1, result2, result3, result4;
        result1 = (x == 20);
        result2 = (x != 20);
        result3 = (x > 0 && x < 30);
        result4 = (x < 0 || x >= 30);

        System.out.println("result1:" + result1);
        System.out.println("result2:" + result2);
        System.out.println("result3:" + result3);
        System.out.println("result4:" + result4);


    }
}
