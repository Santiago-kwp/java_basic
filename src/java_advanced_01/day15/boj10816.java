package java_advanced_01.day15;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class boj10816 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> cards = new HashMap<>();
        int c = 0;
        int num = 0;
        for (String str : br.readLine().split(" ")) {
            c = Integer.parseInt(str);
            if (!cards.containsKey(c))
                cards.put(c, 1);
            else {
                num = cards.get(c);
                cards.put(c, ++num);
            }
        }

        int M = Integer.parseInt(br.readLine());
        // 최대 50만개의 M * 50만개의 N = 2500 억은 1초 안에 연산이 어려움..
        // 보통 1초에 1억개의 연산이 가능 하므로 목적은 로그연산이 가능하도록
        // 숫자 카드를 저장한 객체와 같은지 찾을 때 이분 탐색을 통해 있는지 여부를 찾을 수 있어야 한다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (String str : br.readLine().split(" ")) {
            c = Integer.parseInt(str);
            if (cards.containsKey(c)) {
                bw.write(Integer.toString(cards.get(c))+" ");
            } else {
                bw.write("0 ");
            }
        }
        bw.flush();
    }
}
