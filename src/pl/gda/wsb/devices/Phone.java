package pl.gda.wsb.devices;

import pl.gda.wsb.creatures.Human;
import pl.gda.wsb.Producer;

public class Phone extends Device{
    public  String marka;
    public  int number;

    public Phone(String model, String marka, int number, Producer producer, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.marka = marka;
        this.number = number;

    }



    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", producer='" + producer + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println(toString()+"uruchamia się");
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception{
        if(buyer.getCash() >= price){
            if(seller.getPhone() == this ){
                buyer.setPhone(this);
                seller.setPhone(null);
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                System.out.println("Sprzedano tel");
            }else {
                throw new Exception("Klient nie ma tego tel.");
            }
        }else {
            throw new Exception("Klient nie ma kasy!");
        }
    }
}
