package javabasic_02.day12.practiceEx.prob3;

public class Truck extends Wheeler{
    public Truck(String carName, int velocity, int wheelNumber){
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    @Override
    public void speedUp(int speed) {
        this.velocity += speed*5;
        if (this.velocity > 100) {
            this.velocity = 100;
        }
        System.out.println("트럭의 현재 속도는 "+this.velocity+" 입니다.");

    }

    @Override
    public void speedDown(int speed) {
        this.velocity -= speed*5;
        if (this.velocity < 50) {
            this.velocity = 50;
            System.out.println("트럭의 최저속도위반으로 속도를 "+this.velocity+"으로 올립니다.");
        }

    }
}
