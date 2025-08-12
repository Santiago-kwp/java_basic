package java_advanced_01.day13.homework_solv_prob2;

public class CarFactory extends Factory implements IWorkingTogether{

    public CarFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    int makeProducts(char skill) {
        switch(skill) {
            case 'A' -> { return 3 * this.getWorkingTime(); }
            case 'B' -> { return 2 * this.getWorkingTime(); }
            case 'C' -> { return this.getWorkingTime(); }
            default  -> { return 0; }

        }
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return ((CarFactory)partner).makeProducts('B');
    }
}
