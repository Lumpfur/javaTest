package app;

import vehicles.Vehicle;
import vehicles.Car;
import vehicles.ElectricCar;

class TestCar {
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ ПОЛИМОРФИЗМА И ИНКАПСУЛЯЦИИ ===\n");

        // создаем массив для транспортных средств (полиморфизм)
        Vehicle[] vehicles = new Vehicle[4];

        // создаем обьекты через полиморфные ссылки
        vehicles[0] = new Car("Toyota Camry", "А123ВС77", "Синий", 2020,
                "Иван Иванов", "INS123456", "Бензиновый");

        vehicles[1] = new ElectricCar("Tesla Model 3", "Е777ХХ77", "Белый", 2022,
                "Анна Сидорова", "INS789012", 75.9);

        vehicles[2] = new Car("Honda Civic", "В456ОР77", "Черный", 2019,
                "Сергей Сергеев", "INS555888", "Дизельный");

        vehicles[3] = new ElectricCar("Nissan Leaf", "Э999АА77", "Зеленый", 2021,
                "Мария Иванова", "INS333444", 60.0);

        // демонстрация самого полиморфизма - вывод информации
        System.out.println("Исходная информация о транспортных средствах:");
        System.out.println("=".repeat(80));
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println((i + 1) + ". " + vehicles[i].toString());
        }

        // изменение свойств через сеттеры (демонстрация инкапсуляции)
        System.out.println("\n" + "=".repeat(80));
        System.out.println("ИЗМЕНЕНИЕ СВОЙСТВ ЧЕРЕЗ СЕТТЕРЫ:");
        System.out.println("=".repeat(80));

        // изменение свойств первого автомобиля
        vehicles[0].setOwnerName("Петр Петров");
        vehicles[0].setColor("Красный");
        vehicles[0].setEngineType("Гибридный");

        // изменение свойств электромобиля (с приведением типа)
        if (vehicles[1] instanceof ElectricCar) { // instanceof оператор для проверки пренадлежности к классу
            ElectricCar electricCar = (ElectricCar) vehicles[1];
            electricCar.setBatteryCapacity(85.0);
            electricCar.setOwnerName("Ольга Олегова");
        }

        // изменение свойств третьего автомобиля
        vehicles[2].setYear(2020);
        vehicles[2].setInsuranceNumber("INS999000");

        // изменение свойств второго электромобиля
        if (vehicles[3] instanceof ElectricCar) {
            ElectricCar secondElectric = (ElectricCar) vehicles[3];
            secondElectric.setBatteryCapacity(70.5);
            secondElectric.setColor("Серебристый");
        }

        // обновленная инфа
        System.out.println("\nОбновленная информация о транспортных средствах:");
        System.out.println("=".repeat(80));
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println((i + 1) + ". " + vehicles[i].toString());
        }

        // демонстрация работы геттеров (инкапсуляция)
        System.out.println("\n" + "=".repeat(80));
        System.out.println("ДОСТУП К СВОЙСТВАМ ЧЕРЕЗ ГЕТТЕРЫ:");
        System.out.println("=".repeat(80));

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("ТС " + (i + 1) + ":");
            System.out.println("  Тип: " + vehicles[i].vehicleType());
            System.out.println("  Модель: " + vehicles[i].getModel());
            System.out.println("  Владелец: " + vehicles[i].getOwnerName());
            System.out.println("  Двигатель: " + vehicles[i].getEngineType());

            // для электромобилей показываем емкость батареи
            if (vehicles[i] instanceof ElectricCar) {
                ElectricCar electric = (ElectricCar) vehicles[i];
                System.out.println("  Емкость батареи: " + electric.getBatteryCapacity() + " кВт·ч");
            }
            System.out.println();
        }

        // демонстрация разных типов через полиморфный метод vehicleType()
        System.out.println("=".repeat(80));
        System.out.println("ДЕМОНСТРАЦИЯ ПОЛИМОРФИЗМА В vehicleType():");
        System.out.println("=".repeat(80));

        for (Vehicle vehicle : vehicles) {
            System.out.println("Объект класса " + vehicle.getClass().getSimpleName() +
                    " возвращает: " + vehicle.vehicleType());
        }

        // дополнительная проверка инкапсуляции
        System.out.println("\n" + "=".repeat(80));
        System.out.println("ПРОВЕРКА ИНКАПСУЛЯЦИИ:");
        System.out.println("=".repeat(80));

        // попытка доступа через геттеры (работает)
        System.out.println("Доступ через геттеры - РАБОТАЕТ:");
        System.out.println("Модель первого ТС: " + vehicles[0].getModel());
        System.out.println("Владелец второго ТС: " + vehicles[1].getOwnerName());

        // комментарий о прямом доступе к private полям (не скомпилируется!!!)
        System.out.println("\nПрямой доступ к private полям - НЕ РАБОТАЕТ (ошибка компиляции):");
        System.out.println("// vehicles[0].model - ошибка: 'model' has private access in 'vehicles.Vehicle'");
        System.out.println("// vehicles[0].ownerName - ошибка: 'ownerName' has private access in 'vehicles.Vehicle'");

        // комментарий о прямом доступе к protected полям
        System.out.println("\nПрямой доступ к protected полям - НЕ РАБОТАЕТ вне пакета/наследников:");
        System.out.println("// vehicles[0].engineType - ошибка: 'engineType' has protected access in 'vehicles.Vehicle'");
    }
}
