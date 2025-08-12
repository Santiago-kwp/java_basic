package java_advanced_01.day13.homework_solv_prob1;

public abstract class Animal {
    protected int speed;
    protected double distance;

    public Animal(int speed) {
        this.speed = speed;
    }
    abstract void run (int hours);

    Double getDistance() { return distance; }
}
