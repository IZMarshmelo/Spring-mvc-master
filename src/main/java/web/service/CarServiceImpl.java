package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    public List<Car> getCarsCount(List<Car> carList, int num) {
        if (num == 0 || num > 5)
            return carList;
        return carList.stream().limit(num).collect(Collectors.toList());
    }
}
