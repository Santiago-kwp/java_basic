package javabasic_02.day11.inheritance.quiz;

public class Son extends Father{
    private String name = "Jason";

    public String getName() {
        return name;
    }

    public void printDetails() {
        System.out.println("나의 이름은 "+this.getName());
        System.out.println("나의 아버지는 "+this.getFamilyName());
        System.out.println("나의 집은 " + this.getHouseAddress());

    }

    public static void main(String[] args) {
        Son objSon = new Son();
        objSon.printDetails();

        Daughter objDauther = new Daughter();
        objDauther.printDetail();
    }
}
