package pl.gda.wsb;

import pl.gda.wsb.creatures.Animal;
import pl.gda.wsb.creatures.Human;
import pl.gda.wsb.devices.Car;
import pl.gda.wsb.devices.Phone;

import java.io.FileWriter;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!!");

        Animal animal1 = new Animal("mouse", "Jerry", 0.8);
        Animal animal2 = new Animal("cat", "Tom", 4.5);
        System.out.println(animal1);
        System.out.println(animal1.getName());

        System.out.println(animal1.getWeight());
        animal1.takeForAWALK();
        System.out.println(animal1.getWeight());
        animal1.takeForAWALK();

        System.out.println(animal2.getWeight());
        animal2.feed();
        System.out.println(animal2.getWeight());
        animal2.feed();
        System.out.println(animal2.getWeight());
        animal2.takeForAWALK();


        if(animal1.getWeight()>animal2.getWeight()) System.out.println("Najcieższym zwierzęciem jest: " + animal1.getName());
        else System.out.println("Najcieższym zwierzęciem jest: " + animal2.getName());


        Animal animalWithMaxWeight = animal1.getWeight() > animal2.getWeight() ? animal1 : animal2;
        StringBuilder animalWithMaxWeightBuilder = new StringBuilder()
        .append("Najcieższym zwierzęciem jest: ")
        .append(animalWithMaxWeight.getSpecies()+ " ")
        .append(animalWithMaxWeight.getName() +" ")
        .append(animalWithMaxWeight.getWeight());
        System.out.println("Najcieższym zwierzęciem jest: " + animalWithMaxWeight.getSpecies() +" "+ animalWithMaxWeight.getName() +" "+ animalWithMaxWeight.getWeight());
        System.out.println(animalWithMaxWeightBuilder);

        ArrayList<Human> humanArrayList = new ArrayList<Human>();
        Human human1 = new Human("Wojtek", "Siedlecki",24);
        Human human2 = new Human("Darek", "Adacki",15);
        Human human3 = new Human("Darek", "Adacki",15);


        System.out.println(human1.age);

        if(human1.age> human2.age) System.out.println("Starszy jest: " + human1.name);
        else System.out.println("Starszy jest: " + human2.name);



        humanArrayList.add(human1);
        humanArrayList.add(human2);
        humanArrayList.add(new Human("Robert","Badacki",56));

        for(Human str: humanArrayList){
            System.out.println(str.name + " "+ str.surname + " "+ str.age);

            FileWriter fw = new FileWriter("human.txt",true);
            fw.write(str.name + " "+ str.surname + " "+ str.age+"\n");
            fw.close();
        }


        Phone phone1 = new Phone("A10", "Samsung", 123654789, Producer.NOKIA, 55);
        Phone phone2 = new Phone("Note 8T", "Redmi", 987654321, Producer.SAMSUNG,55);
        System.out.println(phone1.number);


        Car car1 = new Car("p125", Producer.FIAT, 1251.25, 1250.0, 2018);

        human1.setSalary(10000.0);
        human1.setCar(car1);
        human1.setPet(animal1);
        human1.setPhone(phone1);

        human3.setSalary(10000.0);

        if(human2.equals(human3)) System.out.println("Wynik porównania: TRUE");
        else System.out.println("Wynik porównania: FALSE");

        System.out.println(human1);


        phone1.turnOn();
        car1.turnOn();

        try{
            car1.sell(human1,human3,9800.0);
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            phone1.sell(human1,human3,890.0);
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            animal1.sell(human1,human3,890.0);
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            human2.sell(human1,human3,890.0);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


