package javabasic_02.day12.afternoon.InterfacePractice01;

public abstract class Animal {
    protected int speed; // km/h
    protected double distance; // km

    public Animal(){}
    public Animal(int Speed){
        this.speed = Speed;
    }
    public abstract void run(int hours);
    public double getDistance(){
        return this.distance;
    }


}
