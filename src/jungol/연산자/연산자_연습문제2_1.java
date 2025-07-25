package jungol.연산자;

import java.util.Scanner;

public class 연산자_연습문제2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("5개의 수를 입력하시오. ");
        int addNum = sc.nextInt()+3;
        int minusNum = sc.nextInt()-3;
        int multiNum = sc.nextInt()*3;
        int divNum = sc.nextInt()/3;
        int modNum = sc.nextInt()%3;

        System.out.printf("%d %d %d %d %d",addNum,minusNum,multiNum,divNum,modNum);

    }
}
