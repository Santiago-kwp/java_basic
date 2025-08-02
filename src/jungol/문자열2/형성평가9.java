package jungol.문자열2;

import java.util.Scanner;

public class 형성평가9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        strs[1] = String.format("%.3f", Double.parseDouble(strs[1]));
        StringBuffer sb = new StringBuffer();
        for (String str : strs) {
            sb.append(str);
        }
        int half = (sb.length() % 2 == 0) ? sb.length()/2 : sb.length()/2+1;
        System.out.println(sb.substring(0,half));
        System.out.println(sb.substring(half));


    }
}
