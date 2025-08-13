package java_advanced_01.day14.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class boj10828 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> stack = new ArrayList<>();
        int N = sc.nextInt();
        sc.nextLine();

        String[] inputStr;
        while(N-- > 0){
            inputStr = sc.nextLine().split(" ");
            switch(inputStr[0]) {
                case "push" :
                    stack.add(Integer.parseInt(inputStr[1]));
                    break;
                case "pop" :
                    if (stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.remove(stack.size()-1));
                    break;
                case "size" :
                    System.out.println(stack.size());
                    break;
                case "empty" :
                    if (stack.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;

                case "top" :
                    if (stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.get(stack.size() - 1));
                    break;
            }
        }
    }
}
