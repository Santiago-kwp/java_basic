package java_advanced_01.day15.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class boj11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> circle = new LinkedList<Integer>();
        int N = sc.nextInt();
        int K = sc.nextInt();
        for (int i = 1; i <= N; i++)
            circle.add(i);
        int currentI = 0;
        System.out.print("<");
        while(circle.size() > 1) {
            currentI = (currentI + K -1)%circle.size();
            System.out.print(circle.remove(currentI)+", ");
        }
        System.out.print(circle.iterator().next()+">");


    }
}
