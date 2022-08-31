package web.model;

public class Car {
    private String name;
    private String series;
    private String mark;

    public Car() {
    }

    public Car(String name, String series, String mark) {
        this.mark = mark;
        this.name = name;
        this.series = series;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (getName() != null ? !getName().equals(car.getName()) : car.getName() != null) return false;
        if (getSeries() != null ? !getSeries().equals(car.getSeries()) : car.getSeries() != null) return false;
        return getMark() != null ? getMark().equals(car.getMark()) : car.getMark() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getSeries() != null ? getSeries().hashCode() : 0);
        result = 31 * result + (getMark() != null ? getMark().hashCode() : 0);
        return result;
    }


}
