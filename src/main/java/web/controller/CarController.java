package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;



@Controller
public class CarController {
    private static CarService carService = new CarServiceImpl();
    @Autowired
    public CarController(CarService carService) {
        CarController.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int countCars, Model model) {
        carService.getCarsCount(carService.carList(), countCars);
        model.addAttribute("carList",carService.carList());
        return "cars";
    }
}
