import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        // 3개의 정수를 입력 받아 3개의 정수의 합을 출력하세요
        int num1, num2, num3, result;

        Scanner input = new Scanner(System.in);

        // 각 변수에 값을 할당
        System.out.println("첫 번째 정수 숫자를 입력하세요.");
        num1 = input.nextInt();
        System.out.println("두 번째 정수 숫자를 입력하세요.");
        num2 = input.nextInt();
        System.out.println("세 번째 정수 숫자를 입력하세요.");
        num3 = input.nextInt();

        // 연산
        result = num1 + num2 + num3;

        // 출력
        System.out.println(num1 + " + "+ num2+ " + " + num3 + " = " + result);
        System.out.printf("%d + %d + %d = %d\n", num1, num2, num3, result);
    }
}
