package javabasic_02.day08.string;

public class RefEx02 {
    public static void main(String[] args) {
        String a = "Hello";
        System.out.println(a.hashCode());

        a+= "Java Programming";
        System.out.println(a.hashCode());


    }
}
