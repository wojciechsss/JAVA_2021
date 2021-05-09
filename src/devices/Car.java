package devices;

import pl.gda.wsb.Producer;

public class Car  extends Device{
    public Double mileage;
    final public  Double price;


    public  Car(String model, Producer producer, Double mileage, Double price, Integer yearOfProduction){
        super(producer, model, yearOfProduction);
        this.mileage = mileage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer=" + producer +
                ", yearOfProduction=" + yearOfProduction +
                ", mileage=" + mileage +
                ", mileage=" + price +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("brrrr....");
    }
}
