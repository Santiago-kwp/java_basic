package jungol.문자열2;

import java.util.Arrays;
import java.util.Scanner;

public class 연습문제9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strs = new String[5];
        System.out.println("단어 5개를 입력하세요.");
        for (int i = 0; i < 5; i++) {
             strs[i] = sc.nextLine();
        }
        Arrays.sort(strs);

        for (String str : strs)
            System.out.println(str);


    }
}
