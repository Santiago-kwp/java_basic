package java_advanced_01.day13.homework_solv_prob1;

public class Dog extends Animal {
    public Dog(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        this.distance += this.speed * hours * 0.5;
    }
}
