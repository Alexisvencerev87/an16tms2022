package simple_car;

public class Main {
    public static void main(String[] args) {
        // создем машину с двигателем и баком, изменить двигатель нельзя
        // поля машины не делал


        Car car = new Car(new Engine("Дизельный", 3), new GasTank(60, 36));
        System.out.println(car);
        car.startCar(); // Включаем машину и двигатель соответственно, проверка на пустой бак
        car.stopCar();// глушим
        car.wentCar(100);
        car.startCar();
        car.wentCar(600);
        car.wentCar(600);
        car.addFuel(20);
        car.getFuelInfo();
        car.wentCar(100);
        car.getAllDistance();
    }
}
