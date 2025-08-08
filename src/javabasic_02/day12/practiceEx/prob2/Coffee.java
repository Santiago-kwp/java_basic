package javabasic_02.day12.practiceEx.prob2;

public class Coffee extends Beverage{

    static int amount=0;

    public Coffee(String name) {
        super(name);
        this.calcPrice();
        amount++;
    }

    @Override
    public void calcPrice() {
        switch(this.getName()) {
            case "Americano" -> this.price = 1500;
            case "CafeLatte" -> this.price = 2500;
            case "Cappuccino" -> this.price = 3000;
        }
    }
}
