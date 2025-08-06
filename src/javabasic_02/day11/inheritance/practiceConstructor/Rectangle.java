package javabasic_02.day11.inheritance.practiceConstructor;

public class Rectangle {
    private int width;
    private int height;
    private int area;
    private String color;

    public Rectangle(){
        this.color = "흰색";
    }
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.color = "흰색";
    }

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int height) {
        this.height = height;
    }

    public int getArea() {
        return area;
    }

    public int area() {
        return this.width * this.height;
    }

    public int perimeter() {
        return 2*(this.width + this.height);
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void calculateArea() {
        this.area = this.width * this.height;
    }



}
