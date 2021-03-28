package devices;

import pl.gda.wsb.Producer;

public class Car {
    final public String model;
    final public Producer producer;
    public Double mileage;
    final public  Double price;


    public  Car(String model, Producer producer, Double mileage, Double price){
        this.model = model;
        this.producer = producer;
        this.mileage = mileage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer=" + producer +
                ", mileage=" + mileage +
                ", mileage=" + price +
                '}';
    }
}
