package javabasic_02.day12.practiceEx.prob1;

public class Circle extends Shape{
    private double radius;

    public Circle(String name, int radius){
        super(name);
        this.radius = (double)radius;
    }

    @Override
    public void calculationArea() {
        this.area = Math.PI*radius*radius;
    }
}
