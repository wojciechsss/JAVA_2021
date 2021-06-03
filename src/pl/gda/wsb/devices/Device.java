package pl.gda.wsb.devices;

import pl.gda.wsb.Producer;
import pl.gda.wsb.Saleable;

public abstract class Device implements Saleable {
    public final Producer producer;
    public final  String model;
    public final Integer yearOfProduction;


    protected Device(Producer producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.model = model;
    }

    public abstract void turnOn();
}
