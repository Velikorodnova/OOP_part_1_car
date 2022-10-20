public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;

        if (model == null || model == "") {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (brand == null || brand == "") {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (productionCountry == null || productionCountry == "") {
            this.productionCountry = "default";
        } else {
            this.productionYear = productionYear;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color == "") {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

    }

    public String toString() {
        return "Бренд - " + brand +
                ", Модель - " + model +
                ", Объем двигателя - " + engineVolume +
                ", Цвет - " + color +
                ", Год выпуска - " + productionYear +
                ", Страна сборки - " + productionCountry;
    }
}


