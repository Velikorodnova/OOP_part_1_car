package Transport;

import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
    double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private static boolean summerTires;

    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String transmission, String bodyType, String registrationNumber,
               int numberOfSeats, boolean summerTires) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        summerTires = summerTires;

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionYear = productionYear;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isEmpty()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "Механическая";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "Седан";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats == 0) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "Механическая";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public boolean getSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        LocalDate date = LocalDate.now();
        int currentMonth = date.getMonthValue();
        this.summerTires = currentMonth <= 10 && currentMonth >= 5;
    }


    public boolean correctRegistrationNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }

        char chars[] = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isLetter(chars[4]) || !Character.isLetter(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }

        return true;
    }

    public String toString() {
        return "Бренд - " + brand +
                ", Модель - " + model +
                ", Объем двигателя - " + engineVolume +
                ", Цвет - " + color +
                ", Год выпуска - " + productionYear +
                ", Страна сборки - " + productionCountry +
                ", Коробка передач -  " + transmission +
                ", Тип кузова - " + bodyType +
                ", Регистрационный номер - " + registrationNumber +
                ", Количество мест - " + numberOfSeats +
                ", Шины - " + summerTires;

    }

}


