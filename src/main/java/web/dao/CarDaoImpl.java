package web.dao;

import web.model.Car;

import java.util.Arrays;
import java.util.List;

public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getAllCars() {
        List<Car> car = Arrays.asList(
                new Car("BMW", "Black", 300),
                new Car("Opel", "Red", 180),
                new Car("Chevrolet", "White", 210),
                new Car("Lada", "Green", 160),
                new Car("Mersedes", "Yellow", 330)
        );
        return car;
    }

    @Override
    public List<Car> getNoAllCars(Integer count) {
        List<Car> cars = getAllCars();
        if (count == null || count >= 5) {
            return cars;
        } else {
            return cars.subList(0, Math.min(count, cars.size()));
        }
    }
}
