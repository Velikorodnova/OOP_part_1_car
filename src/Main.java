public class Main {
    public static void main(String[] args) {
        Car lada = new Car("", "Granta", 1.7, "", 2015, "Россия");
        System.out.println(lada);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, null);
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8", 0, "Черный", 2021, "Германия");
        System.out.println(bmw);
        Car kia = new Car("Kia", "Sportage 4", 2.4, "Красный", 0, "Южная Корея");
        System.out.println(kia);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");
        System.out.println(hyundai);
    }
}