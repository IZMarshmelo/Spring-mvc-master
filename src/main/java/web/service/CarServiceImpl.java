package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoSpring;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final CarDao carDao = new CarDaoSpring();

    @Override
    public List<Car> getCarsCount(List<Car> carList, int num) {
        return carDao.getCarsCount(carList, num);
    }

    @Override
    public List<Car> carList() {
        return carDao.carList();
    }
}
