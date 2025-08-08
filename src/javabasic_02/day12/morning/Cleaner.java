package javabasic_02.day12.morning;

public class Cleaner implements RemoteControl {

    private int minutes;

    public Cleaner(int minutes) {
        this.minutes = minutes;
    }

    // 청소기 고유의 기능 구현
    public void clean(int minutes) {
        System.out.println(minutes + "분 동안 청소한다.");
    }

    // 인터페이스에 정의된 공통 기능 구현 -> 청소기 고유의 기능을 구현하여 공통 기능에 추가함.
    @Override
    public void turnOn() {
        System.out.println("청소기의 전원을 킨다.");
        clean(minutes);
    }

    @Override
    public void turnOff() {
        System.out.println("청소기의 전원을 끈다.");
    }

    @Override
    public void setVolume(int volume) {

    }
}