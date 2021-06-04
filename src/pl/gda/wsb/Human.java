package pl.gda.wsb;

import pl.gda.wsb.devices.Car;
import pl.gda.wsb.devices.Phone;

import java.util.Objects;

public class Human {
    public String name;
    public  String surname;
    public  int age;
    private Animal pet;
    private Car car;
    private Phone phone;
    private  Double salary;
    private  Double cash = 15000.0;

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Double getSalary() {
        System.out.println(java.time.LocalDate.now());
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary >= 0.0) {
            this.salary = salary;
            System.out.println("Nowe dane wysłane do systemu księgowego!");
            System.out.println("Należy odebrać aneks od Pani Hani z HR");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty");
        }else {
            System.out.println("Wartość ujemna!!!!");
        }
    }


    public Car getCar() {
        return car;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

//- jeśli zarobki człowieka są wyższe niż cena samochodu wypisujemy info, że udało się kupić za gotówkę i przypisujemy samochód
//- jeżeli zarobi są większe niż 1/12 wartości samochodu wypisujemy info, że udało się kupić na kredyt (no trudno) i przypisujemy samochód
//- w pozostałych wypadkach wypisujemy info, w stylu "zapisz się na studia i znajdź nową robotę albo idź po podwyżkę" i nie przypisujemy samochodu
    public void setCar(Car car) {
        if(this.salary > car.price) {
            this.car = car;
            System.out.println("Brawo!! Zdobyłeś auto za gotówke!!!");
        }else if(this.salary > this.salary/12){
            this.car = car;
            System.out.println("Kredyt!! Trudno kredyt ale i tak zdobyłeś auto!!!");
        }else{
            System.out.println("Przykro mi ale musisz iść po podwyżkę lub zmienić pracę.");
        }
    }

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet) && Objects.equals(car, human.car) && Objects.equals(phone, human.phone) && Objects.equals(cash, human.cash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, pet, car, phone);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                ", car=" + car +
                ", phone=" + phone +
                ", cash=" + cash +
                '}';
    }


    public boolean hasCar(Car newCar){
        if(this.car == newCar){
            return true;
        }
        return false;
    }

    public void removeCar(){
        this.car = null;
    }
}
