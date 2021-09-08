package homework.$20210906.task2;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    Map<Car, Integer> garage = new HashMap<>();

    public void park(Car car) {
        if (garage.containsKey(car)) {
            garage.put(car, garage.get(car) + 1);
        } else {
            garage.put(car, 1);
        }

        System.out.println(car.toString() +  " припаркован!");
    }

    public void unPark(Car car) {
        if (!garage.containsKey(car)) {
            System.out.println(car.toString() + " нет на парковке!");
            return;
        }

        if (garage.get(car) > 1) {
            garage.put(car, garage.get(car) - 1);
        } else {
            garage.remove(car);
        }

        System.out.println(car.toString() + " уехал с парковки!");
    }

    public void carByBrandCount(String brand) {
        int count = 0;
        for (Map.Entry<Car, Integer> entry : garage.entrySet()) {
            if(entry.getKey().getBrand().equals(brand)) {
                count +=entry.getValue();
            }
        }

        System.out.println("автомобилей " + brand + " на парковке " + count + "!");
    }

    public void printAllCars() {
        for (Map.Entry<Car, Integer> pair : garage.entrySet()) {
            System.out.println(pair.getKey() + " находится на парковке в колличестве - " + pair.getValue() + " машин(ы)!");
        }
    }

}
