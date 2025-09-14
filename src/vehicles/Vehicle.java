package vehicles;

public abstract class Vehicle {
    private String model;
    private String license;
    private String color;
    private int year;
    private String ownerName;
    private String insuranceNumber;
    protected String engineType;

    // царский конструктор
    public Vehicle(String model, String license, String color, int year,
                   String ownerName, String insuranceNumber, String engineType) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }

    // абстрактный метод
    public abstract String vehicleType(); // в дальнейшем продемонстрирует как раз переобувочку ;) (полиморфизм)

    // опять куча геттеров и сеттеров этих
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override // @Override обозначает компилятору что метод из дочернего класса переопределяет метод из родительского класса (необязательно, но желательно)
    public String toString() { // статичный (этот тоже переобувочник)
        return "Тип: " + vehicleType() +
                ", Модель: " + model +
                ", Номер: " + license +
                ", Цвет: " + color +
                ", Год: " + year +
                ", Владелец: " + ownerName +
                ", Страховка: " + insuranceNumber +
                ", Двигатель: " + engineType;
    }
}