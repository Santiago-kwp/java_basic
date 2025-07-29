package day04;

public class ForEx02 {
    public static void main(String[] args) {
        // 1 ~ 10까지의 합 출력 : 55 를 작성하세요.
        int result = 0;
        for (int i=1;i<=10;i++)
            result+=i;
        System.out.printf("1 ~ 10까지의 합 : %d",result);
    }
}
