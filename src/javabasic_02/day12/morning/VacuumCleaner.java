package javabasic_02.day12.morning;

public class VacuumCleaner implements RemoteControl{
    private int minutes;
    public VacuumCleaner(int minutes) {
        this.minutes = minutes;
    }

    public void run() {
        System.out.println(this.minutes+"분 간 청소 합니다.");
    }

    @Override
    public void turnOn() {
        System.out.println("청소기의 전원이 켜졌습니다.");
    }



    @Override
    public void turnOff() {
        System.out.println("청소기의 전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {

    }


}
