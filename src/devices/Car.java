package devices;

import pl.gda.wsb.Producer;

public class Car {
    final public String model;
    final public Producer producer;
    public double mileage;


    public  Car(String model, Producer producer, double mileage){
        this.model = model;
        this.producer = producer;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer=" + producer +
                ", mileage=" + mileage +
                '}';
    }
}
