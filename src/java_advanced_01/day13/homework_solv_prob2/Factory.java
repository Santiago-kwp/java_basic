package java_advanced_01.day13.homework_solv_prob2;

public abstract class Factory {
    private int openHour;
    private int closeHour;
    private String name;

    public Factory(String name, int openHour, int closeHour) {
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    String getFactoryName() {
        return this.name;
    }

    int getWorkingTime() {
        return this.closeHour - this.openHour; // 가동 시간 계산하여 반환
    }

    abstract int makeProducts(char skill);
}
