package javabasic_02.day12.practiceEx.prob1;

public class Rectangular extends Shape{
    private double width;
    private double height;

    public Rectangular() {
    }

    public Rectangular(String name, int width, int height) {
        super(name);
        this.width = (double) width;
        this.height = (double) height;
    }

    @Override
    public void calculationArea() {
        this.area = this.width * this.height;
    }
}
