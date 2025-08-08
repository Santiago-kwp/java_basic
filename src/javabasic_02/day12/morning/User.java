package javabasic_02.day12.morning;

public class User {

    public static void main(String[] args) {
        // 인터페이스를 통해 객체의 기능을 수행
        RemoteControl rc = new Television();
        rc.turnOn();

        rc.setVolume(10);
        rc.setVolume(12);
        rc.setVolume(-1);
        rc.setVolume(20);
        rc.turnOff();

        rc.setMute(true);
        rc.setMute(false);

        // 리모컨을 통해 청소기를 동작시키기
        // 1. 전원 키고
        // 2. 청소를 시킨다.
        // 3. 10분 후 청소기를 끈다.
        rc = new Cleaner(10);
        rc.turnOn();
        rc.turnOff();

        // TV의 최대 볼륨 확인 public static final 은 타입.상수명으로 접근
        System.out.println(RemoteControl.MAX_VOLUME);
        // TV의 최소 볼륨 확인
        System.out.println(RemoteControl.MIN_VOLUME);

        RemoteControl.changeBattery();
    }
}