package jungol.반복제어문;

public class 반복제어문_연습문제2 {
    public static void main(String[] args) {
        int num = 1;
        int sum = num;
        while (num++ < 10) {
            sum+= num;
        }
        System.out.printf("1부터 10까지의 합 = %d\n",sum);
        System.out.printf("while문이 끝난 후의 num의 값 = %d", num);

    }
}
