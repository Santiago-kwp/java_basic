package jungol.반복제어문;


import java.util.Scanner;

public class 반복제어문2_자가진단6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for(int i=0;i<N;i++){
            sum+= sc.nextInt();
        }
        System.out.printf("avg : %.1f\n",(double)sum/N);
        System.out.println( (((double)sum/N) >=80)?"pass":"fail");
    }
}
