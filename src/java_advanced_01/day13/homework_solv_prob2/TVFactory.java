package java_advanced_01.day13.homework_solv_prob2;

public class TVFactory extends Factory implements IWorkingTogether{

    public TVFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    int makeProducts(char skill) {
        switch(skill) {
            case 'A' -> { return 8 * this.getWorkingTime(); }
            case 'B' -> { return 5 * this.getWorkingTime(); }
            case 'C' -> { return 3 * this.getWorkingTime(); }
            default  -> { return this.getWorkingTime(); }

        }
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return ((TVFactory)partner).makeProducts('C');
    }
}
