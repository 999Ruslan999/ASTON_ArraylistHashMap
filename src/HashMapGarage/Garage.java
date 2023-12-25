package HashMapGarage;

import java.util.Map;

public class Garage {

    // Это класс гараж, в нём 4 поля разных транпортных средств в виде Мап, в которых ключ это сам автомобиль,
    // а значение это колличество автомобилей.
    // В этом классе я создал методы парковки и выезда из гаража.
    // Как было по заданию нужно добавление в мапу и удаление из неё.

    private Map<Car, Integer> mapBike;

    private Map<Car, Integer> mapBus;

    private Map<Car, Integer> mapJeep;

    private Map<Car, Integer> mapSportsCar;


    public Garage(Map<Car, Integer> mapBike, Map<Car, Integer> mapBus,
                  Map<Car, Integer> mapJeep, Map<Car, Integer> mapSportsCar) {
        this.mapBike = mapBike;
        this.mapBus = mapBus;
        this.mapJeep = mapJeep;
        this.mapSportsCar = mapSportsCar;
    }

    // Метод парковки в гараж (добавление в мапу)
    // Принимает мапу, Сам атомобиль и кол-во.
    // Сначала идёт проверка, на наличие авто, если уже есть такая машина, то прибаляем ещё.
    // Выводим текущее колличество авто в гараже.
    // Иначе просто добавляем авто в гараж.
    public void parking(Map<Car, Integer> map, Car car, int x) {
        if (map.containsKey(car)) {
            int currentCount = map.get(car);
            map.put(car, currentCount + x);
            System.out.println("Машина: " + car + " заехала в гараж. Текущее количество: " + map.get(car));
        } else {
            map.put(car, x);
            System.out.println("Машина: " + car + " заехала в гараж. Текущее количество: " + map.get(car));
        }
    }


    // Метод выезда из гаража(удаление из мапы)
    // Проверяем на наличие авто.
    // Проверяем на наличие Автомобиля.
    // Если такого авто нет, то выводим сообщение о том, что машина отсутствует в гараже.
    // Если в гараже есть столько авто, происходит выезд из гаража(удаление) и выводим оставшееся колличество.
    // Иначе выводим сообщение о том, что столько авто в гараже(мапе) нет.
    public void exit(Map<Car, Integer> map, Car car, int x) {
        if (map.containsKey(car)) {
            int currentCount = map.get(car);
            if (currentCount >= x) {
                map.put(car, currentCount - x);
                System.out.println("Машина: " + car + " выехала из гаража. Текущее количество: " + map.get(car));
            } else {
                System.out.println("Столько машин не может выехать из гаража, так-как их количество меньше чем: " + x);
            }
        } else {
            System.out.println("Машина: " + car + " отсутствует в гараже");
        }
    }

}



