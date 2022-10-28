package Transport;

public class Train extends Transport {

    private double tripPrice;
    private double travelTime;
    private String departureStationName;
    private String endingStation;
    private int amontWagons;
    private int speed;

    public Train(String brand, String model, String color, int productionYear,
                 String productionCountry, double tripPrice, double travelTime,
                 String departureStationName, String endingStation, int amontWagons, int speed) {
        super(brand, model, color, productionYear, productionCountry);
        this.tripPrice = tripPrice;
        this.travelTime = travelTime;
        this.departureStationName = departureStationName;
        this.endingStation = endingStation;
        this.amontWagons = amontWagons;
        this.speed = speed;


        if (tripPrice == 0) {
            this.tripPrice = 1000.00;
        } else {
            this.tripPrice = tripPrice;
        }

        if (travelTime <= 0) {
            this.travelTime = 1.3;
        } else {
            this.travelTime = travelTime;
        }

        if (departureStationName == null || departureStationName.isEmpty()) {
            this.departureStationName = "Не указано название станции";
        } else {
            this.departureStationName = departureStationName;
        }

        if (endingStation == null || endingStation.isEmpty()) {
            this.endingStation = "Не указано название станции";
        } else {
            this.endingStation = endingStation;
        }

        if (amontWagons == 0) {
            this.amontWagons = 2;
        } else {
            this.amontWagons = amontWagons;
        }

        if (speed == 0) {
            this.speed = 100;
        } else {
            this.speed = speed;
        }

    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        if (tripPrice == 0.0) {
            this.tripPrice = 1000;
        } else {
            this.tripPrice = tripPrice;
        }
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        if (travelTime == 0.0) {
            this.travelTime = 1.00;
        } else {
            this.travelTime = travelTime;
        }
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        if (departureStationName == null || departureStationName.isEmpty()) {
            this.departureStationName = "Не указано название станции";
        } else {
            this.departureStationName = departureStationName;
        }
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        if (endingStation == null || endingStation.isEmpty()) {
            this.endingStation = "Не указано название станции";
        } else {
            this.endingStation = endingStation;
        }
    }

    public int getAmontWagons() {
        return amontWagons;
    }


    public void setAmontWagons(int amontWagons) {
        if (amontWagons == 0) {
            this.amontWagons = 2;
        } else {
            this.amontWagons = amontWagons;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void refill() {
        System.out.println("Нужно заправить дизельным топливом");

}

    @Override
    public String toString() {
        return super.toString() + " Цена поездки - " + tripPrice +
                ", Время поездки - " + travelTime +
                ", Станция отбытия - " + departureStationName +
                ", Конечная станция - " + endingStation +
                ", Количество вагонов - " + amontWagons +
                ", Скорость - " + speed;
    }


}
