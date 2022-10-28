import Transport.Bus;
import Transport.Car;
import Transport.Train;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", "Синий", 2015, "Россия", 1.7, "Механическая", "Хечбек", "B222AK777", 5, true);
        System.out.println(lada);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", "Черный", 2020, null, 3.0, "Механическая", "Хечбек", "B222AK777", 5, false);
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8", "Черный", 2021, "Германия", 0, "Механическая", "Хечбек", "B222AK777", 5, true);
        System.out.println(bmw);
        Car kia = new Car("Kia", "Sportage 4", "Красный", 0, "Южная Корея", 2.4, "Механическая", "Хечбек", "B222AK777", 5, false);
        System.out.println(kia);
        Car hyundai = new Car("Hyundai", "Avante", "Оранжевый", 2016, "Южная Корея", 1.6, "Механическая", "Хечбек", "B222AK777", 5, true);
        System.out.println(hyundai);

        Bus paz = new Bus("ПАЗ", "32053", "Синий", 2020, "Россия");
        System.out.println(paz);


        Train lastochka = new Train("Ласточка", "В-901", null, 2011, "Россия", 3500.00, 0, "Белорусский вокзал",
                "Минск", 11, 0);
        System.out.println(lastochka);

        Train leningrad = new Train("Ленинград", "D-125", "Синий", 2019, "Россия", 1700.00, 0, "Ленинградский вокзал",
                "Ленинград", 8, 0);
        System.out.println(leningrad);
        lastochka.refill();
        hyundai.refill();
        paz.refill();

    }
}