package web.service;


import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {

    @Override
    public List<Car> getlistCars() {
        Car car = new Car();
        return car.arrCars;
    }

    @Override
    public List<Car> getlistCarsWithNum(int s) {
        List<Car> res = new ArrayList<>();
        Car car = new Car();
        car.initArray();
        if (s > 5) {
            return getlistCars();
        }
        for (Car x : car.arrCars) {
            if (0 == s) {
                break;
            }
            s--;
            res.add(x);
        }
        return res;
    }


}
