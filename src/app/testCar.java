package app;

import vehicles.Car;
import vehicles.ElectricCar;

class TestCar {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "A123BC77", "Black", 2023, "Dima", "QQ123456B", "idk");
        ElectricCar eCar = new ElectricCar("Honda", "A121AA33", "White", 2023, "Danya", "AB123456C", 35.5);

        car.setOwnerName("Aik");
        eCar.setOwnerName("Akim");
        car.setColor("Yellow");
        eCar.setYear(2019);

        System.out.println(car.toString());
        System.out.println(eCar.toString());


    }
}
