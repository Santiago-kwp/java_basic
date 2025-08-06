package javabasic_02.day11.inheritance.quiz;

public class Cat extends Animal{
    public void meow() {
        System.out.println("야옹");
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.eat();
        cat1.meow();
    }
}
