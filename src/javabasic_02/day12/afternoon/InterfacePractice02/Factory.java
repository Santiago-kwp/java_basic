package javabasic_02.day12.afternoon.InterfacePractice02;

public abstract class Factory {
    protected int openHour;
    protected int closeHour;
    protected String name;

    public Factory(String name, int openHour, int closeHour) {
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    public String getFactoryName() {
        return this.name;
    }

    public int getWorkingTime() {
        return closeHour - openHour;
    }

    public abstract int makeProducts(char skill);
}

