package Transport;

public class Bus extends Transport {


    @Override
    public void refill() {
        System.out.println("Нужно заправить бензином или дизельным топливом");
    }

    public Bus(String brand, String model, String color, int productionYear, String productionCountry) {
        super(brand, model, color, productionYear, productionCountry);
    }

    public Bus(double maxSpeed) {
        super(maxSpeed);
    }

}






