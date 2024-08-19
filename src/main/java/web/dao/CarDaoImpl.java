package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Ford", "RED", 1000));
        carList.add(new Car("Ferrari", "YELLOW", 700));
        carList.add(new Car("Aston Martin", "BLACK", 500));
        carList.add(new Car("FIAT", "GREEN", 180));
        carList.add(new Car("BMW", "BLUE", 100));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0 || count >= 5) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
