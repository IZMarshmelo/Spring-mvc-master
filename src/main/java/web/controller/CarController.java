package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    private final CarServiceImpl carService;
    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int countCars, Model model) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(2018, "Lada", 1.8));
        carList.add(new Car(1988, "Porsche", 5.0));
        carList.add(new Car(2021, "Mercedes", 6.9));
        carList.add(new Car(1998, "Yral", 4.0));
        carList.add(new Car(2020, "Tesla", 5.5));
        carList = carService.getCarsCount(carList, countCars);
        model.addAttribute("carList", carList);
        return "cars";
    }
}
