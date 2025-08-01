package jungol.문자열2;

import java.util.Scanner;

public class 연습문제7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strs =  {"champion", "tel", "pencil", "jungol", "olympiad", "class", "information", "lesson", "book", "lion"};
        String str;
        int count = 0;
        for (int n = 0; n < 2; n++) {
            if (n ==0 )
                System.out.print("문자를 입력하세요. ");
            else
                System.out.print("문자열을 입력하세요. ");

            str = sc.nextLine();
            count = 0;

            for (int i = 0; i < strs.length; i++) {
                if (strs[i].contains(str)) {
                    System.out.println(strs[i]);
                    count++;
                }
            }
            if(count==0) System.out.println("찾는 단어가 없습니다.");
            System.out.println();
        }

    }
}
