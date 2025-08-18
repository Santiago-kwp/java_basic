package java_advanced_01.day16.comparableEx;

import java.util.Set;
import java.util.TreeSet;

public class Fruit implements Comparable<Fruit> {
    private String name;
    private int cost;
    public Fruit(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    @Override
    public int compareTo(Fruit o) {
        return this.cost - o.cost;
    }

    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 10000);
        Fruit tangerine = new Fruit("Tangerine", 12000);
        Fruit peach = new Fruit("Peach", 8000);
        Fruit grape = new Fruit("Grape", 18000);

        Set<Fruit> treeSet = new TreeSet<Fruit>();
        treeSet.add(apple);
        treeSet.add(tangerine);
        treeSet.add(grape);
        treeSet.add(peach);
        for (Fruit f : treeSet) {
            System.out.println(f.name + " " + f.cost);
        }
    }
}
