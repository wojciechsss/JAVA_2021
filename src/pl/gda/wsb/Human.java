package pl.gda.wsb;

import java.util.ArrayList;
import java.util.Objects;

public class Human {
    public String name;
    public  String surname;
    public  int age;
    public Animal pet;
    public  Car car;

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
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, pet);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                ", car=" + car +
                '}';
    }
}
