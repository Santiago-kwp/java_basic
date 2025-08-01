package jungol.문자열1;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class 연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "우리나라 대한민국!";
        System.out.println(input);
        byte[] utf8Bytes = input.getBytes(StandardCharsets.UTF_8);
        System.out.printf("위 문자열의 길이는 %d입니다.",utf8Bytes.length);

    }
}
