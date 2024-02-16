package task1;

import java.util.*;
public class DemoCollection {

    public static void main(String[] args) {
        List<String> Cars = new ArrayList<>(5);
        List<String> Bike = new ArrayList<>(10);

        Cars.add("Hyundai");
        Cars.add("LR");
        Cars.add("Opel");
        Cars.add("Lexus");
        Cars.add("Rimac");

        Bike.add("Bajaj Dominar");
        Bike.add("Triumph Tiger");
        Bike.add("Suzuki Intruder");
        Bike.add("Bajaj Pulsar");
        Bike.add("TVS Apache RTR");
        Bike.add("RE Classic");
        Bike.add("Triumph Bonneville Bobber");
        Bike.add("Yamaha R1");
        Bike.add("Kawasaki ZX400R");
        Bike.add("Yamaha MT09");

        for (String str : Cars) {
            System.out.println(str);
        }

        for (String chk : Bike) {
            if (chk.contains("Bajaj")) {
                System.out.println(chk);
            }
        }
    }
}
