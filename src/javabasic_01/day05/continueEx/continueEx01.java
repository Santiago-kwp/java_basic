package javabasic_01.day05.continueEx;

public class continueEx01 {
    // continue문은 반복문인 for, while, do-while에서만 사용된다.
    // 블록 내부에서 continue 문이 사용되면, for문의 증감식, 또는 while, do-while문의 조건식으로 바로 이동한다.

    // continue문은 반복문을 종료시키지 않고 계속 반복을 수행한다는 점이 break문과 다르다.
    public static void main(String[] args) {
        // 1부터 10사이의 수 중 짝수만 출력하고 홀수인 경우 스킵하고 반복으로 넘어가게 작성
        for (int i=1; i <=10; i++) {
            System.out.println("i = " + i);
            if(i % 2 !=0){
                continue;
            }
            System.out.println("결과 출력: " + i);
        }
    }
}
