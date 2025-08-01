package javabasic_01.day03;

import java.util.Scanner;

public class BlockScope {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        System.out.println("이름 입력: ");
        String name = sc.nextLine();
        callName(name);

//        System.out.println("나의 이름은 " + name);
    }

    private static void callName(String name) {
        System.out.println("나의 이름은 " + name);
        System.out.println("직무 입력 : ");
        String job = sc.nextLine();
        System.out.println('a'-'A');
    }
}
