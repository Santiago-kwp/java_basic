package javabasic_02.day09.methodbasic;

import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);
    static boolean a = true;

    public static void main(String[] args) {
        while(a){
            menu();
            String[] inputLine = sc.nextLine().split(" ");
            calculator(inputLine); // 원본 데이터를 그냥 던지자
        }
    }

    //사용자가 입력한 아이디와 비밀번호를 idPwPrint()를 이용하여 출력하세요.
    public static void calculator(String[] data) {
        if (data.length ==1 ) {
            a = false;
            return;
        }
        int num1, num2, menuNum, result = 0;
        num1 = Integer.parseInt(data[0]);
        num2 = Integer.parseInt(data[1]);
        menuNum = Integer.parseInt(data[2]);

        switch (menuNum) {
            case 1: result = num1 + num2; break;
            case 2: result = num1 - num2; break;
            case 3: result = num1 * num2; break;
            case 4: result = num1 / num2; break;
            case 5: a = false; break;
            default:
                System.out.println("숫자만 입력해주세요.");
        }
        menu2(num1,num2,menuNum,result);
    }

    public static void menu() {
        System.out.println("======================================================");
        System.out.println("                     사칙 연산 계산기                    ");
        System.out.println("======================================================");
        System.out.println("1. 덧셈   2. 뺄셈    3. 곱셈    4. 나눗셈   5. 프로그램 종료");
    }

    public static void menu2(int num1, int num2, int menuNum,int result) {
        switch (menuNum) {
            case 1: System.out.printf("%d + %d = %d \n",num1, num2,result); break;
            case 2: System.out.printf("%d - %d = %d \n",num1, num2,result); break;
            case 3: System.out.printf("%d * %d = %d \n",num1, num2,result); break;
            case 4: System.out.printf("%d / %d = %.1f \n",num1, num2,(double)result); break;
            case 5: a = false;

        }
    }
}