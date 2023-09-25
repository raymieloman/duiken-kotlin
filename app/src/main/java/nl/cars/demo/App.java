package nl.cars.demo;

import java.util.ArrayList;
import java.util.List;
/*
This class demos that you cannot add to a method which expects a List<? extends Car>
 */
public class App {
    // every car can be added but the List by invariant (exact Car)
    public static void defaultMethod(List<Car> cars) {
        // must be List of exactly Car
        cars.add((new Car()));
        cars.add(new Truck());
    }

    public static void methodExtends(List<? extends Car> carsOrSubClasses) {
        // all List of (subtypes of) Car are welcome. Addition not allowed
    }

    public static void methodSuper(List<? super Car> carsOrSuperClasses) {
        // all List of Car or supertype are welcome. Addition allowed of Car or lower
        carsOrSuperClasses.add(new Truck());
        carsOrSuperClasses.add(new Racecar());
        carsOrSuperClasses.add(new Car());
    }

    public static void main(String[] args) {
        List<Truck> trucks = new ArrayList<>();
//        defaultMethod(trucks); // error

//        defaultMethod(new ArrayList<Truck>());
        defaultMethod(new ArrayList<Car>()); // ok
//        methodSuper(new ArrayList<Truck>()); // fails
        methodSuper(new ArrayList<Car>()); // OK
        List<Object> list = new ArrayList<>();
        methodSuper(list); // completely legal. Since a list of Object can contain a Car Object
    }
}
