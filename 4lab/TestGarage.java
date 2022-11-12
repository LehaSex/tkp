public class TestGarage {
    public static void main(String[] args) {
        GarageCar myGarage = new GarageCar(); // создаем новый гараж
        Car myCar1 = new Car("Ford", 200, "А777УЕ", "Mustang", 2, true); // создаем легковую машину
        myGarage.addCar(myCar1); // добавляем ее в гараж
        myGarage.addCar(new Car("LADA", 140, "В666ОР", "Kalina", 4, false));// добавляем еще одну машину
        Truck myTruck = new Truck("Dove", 160, "М851ХА", "DTS", 700, true);// создаем грузовик
        myGarage.addCar(myTruck); // добавляем его в гараж
        myGarage.printGarage(); // выводи на экран содержимое гаража
        if (myGarage.findCar(myCar1)) { // ищем машину
            System.out.println("Машина "+myCar1.getFirm()+" "+myCar1.getModel()+" найдена!");
        } else {
            System.out.println("Машина не найдена!");
        }
        myGarage.removeCar(myCar1); // удаляем машину
        myGarage.printGarage(); // выводим на экран содержимое гаража
    }
}