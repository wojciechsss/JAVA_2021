package pl.gda.wsb.devices;

import pl.gda.wsb.Human;
import pl.gda.wsb.Producer;

public class Car  extends Device {
    public Double mileage;
    final public Double price;


    public Car(String model, Producer producer, Double mileage, Double price, Integer yearOfProduction) {
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

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if(!seller.hasCar(this)){
            throw new Exception("Klient nie ma tego auta!!");
        }
        if(buyer.getCash() < price){
            throw new Exception("Klient nie ma kasy");
        }
        buyer.setCar(this);
        seller.removeCar();
        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        System.out.println("Sprzedano auto " + this.producer + " " + this.model + "Kupił " + buyer.surname + " od "+ seller.surname + " za " + price);
    }
}


