package javabasic_02.day12.practiceEx.prob2;

public class Tea extends Beverage{

    static int amount=0;

    public Tea(String name) {
        super(name);
        this.calcPrice();
        amount++;
    }

    @Override
    public void calcPrice() {
        switch(this.getName()) {
            case "lemonTea" -> this.price = 1500;
            case "ginsengTea" -> this.price = 2500;
            case "redginsengTea" -> this.price = 3000;
        }
    }

}
