package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {

    private List<Car> arrCars;

    @Override
    public List<Car> getlistCars() {
        Car car = new Car();
        return arrCars;
    }

    @Override
    public List<Car> getlistCarsWithNum(int s) {
        List<Car> res = new ArrayList<>();
        toInitArray();
        if (s > 5) {
            return getlistCars();
        }
        for (int i = 0; i < s; i++) {
            res.add(arrCars.get(i));
        }
        return res;
    }

    @Override
    public void toInitArray() {
        arrCars = new ArrayList<>();
        arrCars.add(new Car("BMW", "5", "e34"));
        arrCars.add(new Car("Audi", "a8", "D4"));
        arrCars.add(new Car("Mercedes", "G-Class", "W463"));
        arrCars.add(new Car("UAZ", "legend", "1"));
        arrCars.add(new Car("Lada", "1", "1"));
    }


}
