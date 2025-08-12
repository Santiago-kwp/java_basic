package java_advanced_01.day13.homework_solv_prob1;

public class Chicken extends Animal implements Cheatable{


    public Chicken(int speed) {
        super(speed);
    }
    @Override
    void run(int hours) {
        this.distance += (double)this.speed * hours;
    }

    @Override
    public void fly() {
        this.speed *= 2;
    }
}
