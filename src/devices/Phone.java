package devices;

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
}
