package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.model.Car;


import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    final CarDaoImpl carDao = new CarDaoImpl();

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getNoAllCars(Integer count) {
        return carDao.getNoAllCars(count);
    }
}
