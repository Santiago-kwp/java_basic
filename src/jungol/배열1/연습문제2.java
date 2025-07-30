package jungol.배열1;


public class 연습문제2 {
    public static void main(String[] args) {

        char[] arr = new char[26];
        char capital = 'A';
        for (int i = 0; i < arr.length; i++) {
            arr[i] = capital++;
        }

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.printf("%c ", arr[i]);

        }


    }
}
