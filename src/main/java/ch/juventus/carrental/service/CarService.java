package ch.juventus.carrental.service;

import ch.juventus.carrental.model.Car;
import ch.juventus.carrental.model.CarFilter;
import ch.juventus.carrental.model.Rental;

import java.util.List;

public interface CarService {

    Boolean createCar(Car car);

    List<Car> getCars();

    List<Car> getFilteredCars(CarFilter carFilter);

    Car getCar(Long id);

    Boolean updateCar(Long id, Car car);

    Boolean deleteCar(Long id);

    Boolean createRental(Long id, Rental rental);
}
