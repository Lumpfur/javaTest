package vehicles;

public class ElectricCar extends Car {
    private double batteryCapacity;


    public ElectricCar(String model, String license, String color, int year,
                       String ownerName, String insuranceNumber, double batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber, "Электрический"); // аналогично, но уже трехуровневая иерархия
        this.batteryCapacity = batteryCapacity; // новый параметр и снова указатель
    }

    //@Override
    public String vehicleType() {
        return "Электромобиль";
    }

    // геттеры и сеттеры для batteryCapacity
    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    //@Override
    public String toString() {
        return super.toString() + ", Емкость батареи: " + batteryCapacity + " кВт·ч";
    }
}
