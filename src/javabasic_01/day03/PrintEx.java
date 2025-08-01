package javabasic_01.day03;

import java.util.Scanner;

public class PrintEx {
    public static void main(String[] args) {
        /*//  정수 ___123을 prinf()로 출력하자.
        System.out.printf("%6d\n",123);

        // 정수 123___을 printf()로 출력하자.
        System.out.printf("%-6d\n",123);

        // 정수 000123을 printf()로 출력하자.
        System.out.printf("%06d\n",123);

        // 정수 7자리 + 소수점 + 소수2자리 왼쪽 빈자리 공백 ____123.45
        System.out.printf("%10.2f\n",123.45);

        // 정수 7자리 + 소수점 + 소수2자리 왼쪽 빈자리 0
        System.out.printf("%010.2f\n",123.45);

        // 문자열은 %s 포맷
        System.out.printf("%s\n","abc");
        // ___abc출력
        System.out.printf("%6s\n","abc");

        // 특수 문자 \t, \n, %%
        System.out.printf("소금물의 농도 %% %1$d\n",35);*/

        int price = 5000;
        System.out.printf("상품의 가격: %d원\n",price);
        System.out.printf("상품의 가격: %8d원\n",price);
        System.out.printf("상품의 가격: %08d원\n",price);


        System.out.println("반지름을 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        System.out.printf("반지름이 %d인 원의 넓이: %.1f",rad,rad*rad*Math.PI);


    }
}
