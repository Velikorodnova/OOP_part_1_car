import Transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("", "Granta", 1.7, "", 2015, "Россия", "Механическая", "Хечбек", "B222AK777", 5, true);
        System.out.println(lada);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, null, "Механическая", "Хечбек", "B222AK777", 5, false);
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8", 0, "Черный", 2021, "Германия", "Механическая", "Хечбек", "B222AK777", 5, true);
        System.out.println(bmw);
        Car kia = new Car("Kia", "Sportage 4", 2.4, "Красный", 0, "Южная Корея", "Механическая", "Хечбек", "B222AK777", 5, false);
        System.out.println(kia);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея", "Механическая", "Хечбек", "B222AK777", 5, true);
        System.out.println(hyundai);

        lada.setRegistrationNumber("5777AA555");
        System.out.println(lada.correctRegistrationNumber());




    }

}