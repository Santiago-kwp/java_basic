package java_advanced_01.day13.interfaceEx;

import java.util.ArrayList;
import java.util.List;

public class User {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();

        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        vehicleList.add(bus);
        vehicleList.add(bus);



    }
}
