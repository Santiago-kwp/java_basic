package javabasic_02.day11.inheritance.quiz;

public class Daughter extends Father{

    private String name = "Janifer";

    public String getName() {
        return this.name;
    }

    public void printDetail() {
        System.out.println("나의 이름은 "+this.getName());
        System.out.println("나의 아버지는 "+this.getFamilyName());
        System.out.println("나의 집은 " + this.getHouseAddress());
    }


}
