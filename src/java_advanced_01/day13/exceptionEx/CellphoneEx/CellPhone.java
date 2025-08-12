package java_advanced_01.day13.exceptionEx.CellphoneEx;

public class CellPhone {
    private String model;
    private double battery;

    public CellPhone(String model){
        this.model = model;
    }

    public void call(int time){
        System.out.println("통화 시간 : " + time + "분");
        this.battery = Math.max(0,this.battery-time*0.5);

        if (time < 0) {
            System.out.println(new IllegalArgumentException("통화시간입력오류").getMessage());
        }

    }

    public void charge(int time) throws IllegalArgumentException{
        System.out.println("충전 시간 : " + time + "분");
        this.battery = Math.min(100, this.battery+3*time);
        if (time < 0) {
            System.out.println(new IllegalArgumentException("충전시간입력오류").getMessage());
        }
    }

    public void printBattery() {
        System.out.println("남은 배터리 양 : " + this.battery);
    }
}
