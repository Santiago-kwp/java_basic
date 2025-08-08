package javabasic_02.day12.afternoon.InterfacePractice01;

public class Dog extends Animal{

    public Dog(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        this.distance += hours * this.speed * 0.5;

    }
}
