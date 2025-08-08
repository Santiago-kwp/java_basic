package javabasic_02.day12.afternoon.sec01;

import java.util.ArrayList;
import java.util.List;

public class User1 {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        List<Integer> list = new ArrayList<>();
        rc.turnOn();
        rc.turnOff();
        Searchable searchable = new SmartTelevision();
        searchable.search("www.youtube.com");


    }
}
