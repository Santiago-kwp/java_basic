package javabasic_02.day12.morning;

public interface RemoteControl {
    // 최대 볼륨은 30이다.
    // 최소 볼륨은 0이다.
    public static final int MAX_VOLUME = 30;
    public static final int MIN_VOLUME = 0;
    public void turnOn();
    public void turnOff();

    public void setVolume(int volume); // 볼륨 조정 기능

    // 디폴트 인스턴스 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리 작동 시작");
            setVolume(RemoteControl.MIN_VOLUME);
        }
        else {
            System.out.println("무음 해제");
            setVolume(RemoteControl.MIN_VOLUME);
        }
        cooldown();
    }

    // 정적 메소드
    static void changeBattery() {
        System.out.println("리모콘 건전지를 교환해야 합니다.");

        // 정적 필드, private static method는 접근 및 호출 가능
        System.out.println(RemoteControl.MIN_VOLUME);

        // setMute(true); 인스턴스 메소드, 디폴트 메소드, private 메소드 호출 불가
    }

    // private 메소드
    private void cooldown(){

    }

}

