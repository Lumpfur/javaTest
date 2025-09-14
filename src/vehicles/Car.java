package vehicles;

public class Car extends Vehicle {

    // конструктор
    public Car(String model, String license, String color, int year,
               String ownerName, String insuranceNumber, String engineType) {
        super(model, license, color, year, ownerName, insuranceNumber, engineType); // super вызывает конструктор Vehicle (родителя)
    }

    // реализация абстрактного метода
    @Override
    public String vehicleType() {
        return "Автомобиль";
    }

    // опять переобувка
    @Override
    public String toString() {
        return super.toString();
    }
}