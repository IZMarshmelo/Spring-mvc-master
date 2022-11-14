package web.dao;

import web.model.Car;
import java.util.List;

public interface CarDao {
    public List<Car> getCarsCount(List<Car> carList, int num);
    public List<Car> carList();
}
