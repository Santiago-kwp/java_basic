package javabasic_02.day12.afternoon.InterfacePractice01;

public class Chicken extends Animal implements Cheatable{
    public Chicken(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        this.distance += hours * this.speed;

    }

    @Override
    public void fly() {
        this.speed *= 2;
    }
}
