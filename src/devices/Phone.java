package devices;

public class Phone {
    public  String model;
    public  String marka;
    public  int number;

    public Phone(String model, String marka, int number) {
        this.model = model;
        this.marka = marka;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", number=" + number +
                '}';
    }
}
