package javabasic_01.day05.whileEx;

public class whileEx02 {
    public static void main(String[] args) {
        // 1 부터 100까지 합을 출력하는 프로그램 - while문을 이용
        int loop = 1;
        int sum = 0;
        while(loop <= 100) {
            sum += loop++;
        }
        System.out.println(sum);
    }
}
