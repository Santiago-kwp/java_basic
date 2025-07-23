package jungol;
import java.util.Scanner;

public class 선택제어문_연습문제7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 삽입");
        System.out.println("2. 수정");
        System.out.println("3. 삭제");
        System.out.print("숫자를 선택하세요. ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("삽입을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("수정을 선택하셨습니다.");
                break;
            case 3:
                System.out.println("삭제를 선택하셨습니다.");
                break;
        }


    }
}
