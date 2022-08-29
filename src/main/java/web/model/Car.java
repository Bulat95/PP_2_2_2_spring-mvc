package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public String name;
    public String series;
    public String mark;

    public List<Car> arrCars;

    public Car() {
    }

    public Car(String name, String series, String mark) {
        this.mark = mark;
        this.name = name;
        this.series = series;
    }

    public void initArray (){
        arrCars = new ArrayList<>();
        arrCars.add(new Car("BMW", "5", "e34"));
        arrCars.add(new Car("Audi", "a8", "D4"));
        arrCars.add(new Car("Mercedes", "G-Class", "W463"));
        arrCars.add(new Car("UAZ", "legend", "1"));
        arrCars.add(new Car("Lada", "1", "1"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
