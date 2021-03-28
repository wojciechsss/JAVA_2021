package pl.gda.wsb;

public class Car {
    final public String model;
    final public String producer;
    public double mileage;
    public  Human property;


    public  Car(String model, String producer, double mileage, Human property){
        this.model = model;
        this.producer = producer;
        this.mileage = mileage;
        this.property = property;
    }
}
