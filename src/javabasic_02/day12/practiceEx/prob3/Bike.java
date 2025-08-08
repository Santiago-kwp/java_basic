package javabasic_02.day12.practiceEx.prob3;

public class Bike extends Wheeler{

    public Bike(String carName, int velocity, int wheelNumber){
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    @Override
    public void speedUp(int speed) {
        this.velocity += speed;
        if (this.velocity > 40) {
            this.velocity = 40;
        }
        System.out.println("자전거의 현재 속도는 "+this.velocity+" 입니다.");

    }

    @Override
    public void speedDown(int speed) {
        this.velocity -= speed;
        if (this.velocity < 10) {
            this.velocity = 10;
            System.out.println("자전거의 최저속도위반으로 속도를 "+this.velocity+"으로 올립니다.");
        }

    }
}
