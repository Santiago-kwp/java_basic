package javabasic_01.day07;

public class ArrayExam {
    public static void main(String[] args) {
        char[] apple = {'A','P','P','L','E'};

        // String 클래스의 valueOf 메소드 활용
        // Character 클래스의 toLowerCase() 메소드 활용

        for (char c : apple) {
            System.out.print(String.valueOf(c).toLowerCase());
            // System.out.print(Character.toLowerCase(c));
        }





    }
}
