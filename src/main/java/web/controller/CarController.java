package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

import java.util.Optional;

@Controller
public class CarController {

    private CarServiceImp carServiceImp;

    @Autowired
    public void setCarServiceImp(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count") Optional<Integer> count, Model model) {
        model.addAttribute("cars", carServiceImp.getlistCarsWithNum(count.orElse(0)));
        return "cars";
    }
}
