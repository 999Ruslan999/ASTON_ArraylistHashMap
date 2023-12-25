package HashMapGarage;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {



        Map<Car, Integer> bikeMap = new HashMap<>();
        bikeMap.put(new Bike("Харлей", "Байк", 2020, "A", 200, "Бензин"), 1);

        Map<Car, Integer> busMap = new HashMap<>();
        busMap.put(new Bus("City Bus", "Автобус", 2021, "Е", 200, "Дизель"), 1);

        Map<Car, Integer> jeepMap = new HashMap<>();
        jeepMap.put(new Jeep("Jeep", "Jeep", 2019, "B", 180, "Бензин"), 1);

        Map<Car, Integer> sportsCarMap = new HashMap<>();
        sportsCarMap.put(new SportsCar("Porshe", "911", 2023, "B", 500, "Бензин"), 1);

        Garage garage = new Garage(bikeMap, busMap, jeepMap, sportsCarMap);

        System.out.println("---------------------------------------------------------------");
        garage.parking(bikeMap, new Bike("Хонда", "Спортивный", 2023, "А", 200, "Бензин"), 2);
        System.out.println("---------------------------------------------------------------");
        garage.parking(bikeMap, new Bike("Хонда", "Спортивный", 2023, "А", 200, "Бензин"), 1);
        System.out.println("---------------------------------------------------------------");
        garage.parking(busMap, new Bus("Bus", "Икарус", 2022, "Е", 180, "Дизель"), 1);
        System.out.println("---------------------------------------------------------------");
        garage.exit(jeepMap, new Jeep("TOYOTA", "RAV4", 2021, "B", 200, "Бензин"), 1);
        System.out.println("---------------------------------------------------------------");
        garage.exit(sportsCarMap, new SportsCar("Porshe", "911", 2023, "B", 500, "Бензин"), 2);
        System.out.println("---------------------------------------------------------------");
        garage.exit(sportsCarMap, new SportsCar("Porshe", "911", 2023, "B", 500, "Бензин"), 1);
        System.out.println("---------------------------------------------------------------");

    }
}
