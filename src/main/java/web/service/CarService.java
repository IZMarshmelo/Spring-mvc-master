package web.service;

import web.model.Car;
import java.util.List;

public interface CarService {
   public List<Car> getCarsCount(List<Car> carList, int num);
   public List<Car> carList();
}
