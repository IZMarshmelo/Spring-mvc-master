package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private final List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car(2018, "Lada", 1.8));
        carList.add(new Car(1988, "Porsche", 5.0));
        carList.add(new Car(2021, "Mercedes", 6.9));
        carList.add(new Car(1998, "Yral", 4.0));
        carList.add(new Car(2020, "Tesla", 5.5));
    }

    public List<Car> getAllCars(){
        return carList;
    }

    public List<Car> getCarsCount(int count) {
        List<Car> cars = new ArrayList<>();
        if(count <= carList.size()) {
            for (int i = 0; i < count; i++) {
                cars.add(carList.get(i));
            }
            return cars;
        }
        return getAllCars();
    }
}
