package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Ford", "RED", 1000));
        list.add(new Car("Ferrari", "YELLOW", 700));
        list.add(new Car("Aston Martin", "BLACK", 500));
        list.add(new Car("FIAT", "GREEN", 180));
        list.add(new Car("BMW", "BLUE", 100));
        list = CarService.carsCount(list, allCars);
        model.addAttribute("list", list);
        return "car";

    }
}
