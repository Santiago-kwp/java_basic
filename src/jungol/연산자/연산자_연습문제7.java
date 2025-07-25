package jungol.연산자;



public class 연산자_연습문제7 {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        boolean c = true;

        System.out.printf("%d %d %d %d", (a && b)?1:0, (a || b)?1:0, (b && c)?1:0, (!a)?1:0);

    }
}
