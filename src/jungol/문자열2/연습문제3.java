package jungol.문자열2;

import java.util.Scanner;

public class 연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs =  {"champion", "tel", "pencil", "jungol", "olympiad", "class", "information", "lesson", "book", "lion"};

        System.out.print("문자를 입력하세요. ");

        String c = sc.nextLine();

        int count = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].startsWith(c)) {
                System.out.println(strs[i]);
                count++;
            }
        }

        if(count==0) System.out.println("찾는 단어가 없습니다.");
    }
}
