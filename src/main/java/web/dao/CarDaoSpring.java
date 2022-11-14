package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoSpring implements CarDao {

    public List<Car> carList() {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car(2018, "Lada", 1.8));
        carList.add(new Car(1988, "Porsche", 5.0));
        carList.add(new Car(2021, "Mercedes", 6.9));
        carList.add(new Car(1998, "Yral", 4.0));
        carList.add(new Car(2020, "Tesla", 5.5));

        return carList;
    }

    public List<Car> getCarsCount(List<Car> carList, int num) {
        if (num == 0 || num > 5)
            return carList;
        return carList.stream().limit(num).collect(Collectors.toList());
    }
}
